package Aug19.Exercise2.Dao;

import Aug19.Exercise2.Entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Implementation implements StudentDao {
    private static Cache cache;
    static{
        cache = new Cache();
    }


    @Override
    public void addStudent(Student user) {
        Connection connection = ConnectionFactory.getPGConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Students VALUES (?, ?, ?, ?)");
            ps.setLong(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getProgram());
            int i = ps.executeUpdate();

            if(i == 1) {
                System.out.println("Student Record successfully added");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(Long id) {
        Connection connection = ConnectionFactory.getPGConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM Students WHERE id=" + id);


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public Student getStudent(Long id) {
        Student student =null;
        try {
            if(!cache.isPresent(id)) {
                System.out.println("Fetching data from database....");
                Connection conn = ConnectionFactory.getPGConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Students WHERE id=" + id);

                if (rs.next()) {
                    student = getStudentInfo(rs);
                    cache.addToCache(student);
                    return student;
                }
            }
            else {
                System.out.println("Fetching data from database....");
                student =cache.getFromCache(id);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return student;
    }

    @Override
    public List<Student> getStudents(Long id) {
        Connection connection = ConnectionFactory.getPGConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Students");

            List<Student> s1 = new ArrayList<>();

            while(rs.next()) {
                Student user =getStudentInfo(rs);

                s1.add(user);
            }

            return s1;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        return null;
    }

    @Override
    public void updateStudent(Student user, long i) {
        Connection connection = ConnectionFactory.getPGConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE Students SET name=?, email=?, password=? WHERE id=?");
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getProgram());
            ps.setLong(4, i);
            int j = ps.executeUpdate();

            if(j == 1) {
                System.out.println("Student Record successfully updated");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private Student getStudentInfo(ResultSet rs) throws SQLException{
        Student user = new Student();
        user.setId( rs.getLong("id") );
        user.setName( rs.getString("name") );
        user.setEmail( rs.getString("email") );
        user.setProgram( rs.getString("program") );
        return user;
    }
}

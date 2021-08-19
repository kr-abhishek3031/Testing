package Aug19.Exercise2.Dao;

/*
Create DAO pattern for student and add methods for select, insert, update and delete also use caching to minimise database trips.
Use Postgres as your database and create a STUDENT table using code.
 */
import Aug19.Exercise2.Entity.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.setId((long) 202101);
        //s1.setName("Leonardo");
        //s1.setEmail("example1@good.com");
        //s1.setProgram("CSE");
        Implementation imp1 = new Implementation();
        //imp1.addStudent(s1);
        s1.setId((long) 202104);
        s1.setName("LeonardoCap");
        s1.setEmail("example1@bad.com");
        s1.setProgram("ECE");
        imp1.addStudent(s1);
        Student out = imp1.getStudent(202101L);
        if(out!= null)
        {
            System.out.println("Id:" + out.getId() + " Name:" + out.getName() + " Email:" + out.getEmail() + " Program:"+ out.getProgram());
        }
        Student out1 = imp1.getStudent(202101L);
        if(out1!= null)
        {
            System.out.println("Id:" + out1.getId() + " Name:" + out1.getName() + " Email:" + out1.getEmail() + " Program:"+ out1.getProgram());
        }
    }
}

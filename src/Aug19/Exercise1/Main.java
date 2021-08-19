package Aug19.Exercise1;

/*
Postgresql database
 */
import java.sql.*;

public class Main {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/test";
    static final  String USER ="sa";
    static final  String PASS ="123456";
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try {
            Class.forName(JDBC_DRIVER); //We are using it here to check if this project have JDFC_DRIVER class in out project. Read about Class.forName. If the class exists then it will return the class.
            conn= DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connection created successfully");
            stmt = conn.createStatement();
            System.out.println("Statement created successfully");
            //work with database by using these two objects
            DatabaseMetaData databaseMetaData = conn.getMetaData();

            String createTable = "CREATE TABLE Movies " +
                    "(  MovieID int not NULL,"
            + "Name varchar(255),"
            +"ReleaseYear int,"+
                    "Country varchar(255),"
            +"PRIMARY KEY ( MovieID )) ";
            ResultSet resultSet = databaseMetaData.getTables(null, null, null, new String[] {"TABLE"});
            boolean checkTable = false;
            while (resultSet.next()) {
                String name = resultSet.getString("TABLE_NAME");
                String schema = resultSet.getString("TABLE_SCHEM");
                System.out.println(name + " on schema " + schema);
                //System.out.println(name);
                if(name.equals("MOVIES")){
                    checkTable = true;
                }
            }

            /*
            String addMovie = "INSERT INTO Movies VALUES(1,'Spider Man', 2000, 'US')";
            String addMovie1 = "INSERT INTO Movies VALUES(2,'Spider Man1', 2001, 'US')";
            String addMovie2 = "INSERT INTO Movies VALUES(3,'Spider Man2', 2002, 'US')";
            String addMovie3 = "INSERT INTO Movies VALUES(4,'Spider Man3', 2003, 'US')";
            String addMovie4 = "INSERT INTO Movies VALUES(5,'Spider Man4', 2004, 'US')";
            stmt.executeUpdate(addMovie);
            stmt.executeUpdate(addMovie1);
            stmt.executeUpdate(addMovie2);
            stmt.executeUpdate(addMovie3);
            stmt.executeUpdate(addMovie4);
            */
            String showall = "SELECT * FROM Movies";
            ResultSet rs = stmt.executeQuery(showall);
            showOutput(rs);
            String update = "UPDATE Movies SET ReleaseYear= 1998 WHERE ReleaseYear=2000";
            //ResultSet rs1 = stmt.executeUpdate(update);
            stmt.executeUpdate(update);
            String delete = "delete from Movies where ReleaseYear = 2001";
            stmt.executeUpdate(delete);
            rs = stmt.executeQuery(showall);
            showOutput(rs);

            String showActors = "SELECT * FROM Actors";
            rs = stmt.executeQuery(showActors);
            showActors1(rs);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showOutput(ResultSet rs) throws SQLException {
        while(rs.next()) {
            // Retrieve by column name
            int id  = rs.getInt("MovieID");
            String name = rs.getString("Name");
            int year = rs.getInt("ReleaseYear");
            String country = rs.getString("Country");

            // Display values
            System.out.print("ID: " + id);
            System.out.print(", Name: " + name);
            System.out.print(", Year: " + year);
            System.out.println(", Country: " + country);
        }
    }
    public static void showActors1(ResultSet rs) throws SQLException {
        while(rs.next()) {
            // Retrieve by column name
            int id  = rs.getInt("ActorID");
            String name = rs.getString("Name");
            String country = rs.getString("Country");

            // Display values
            System.out.print("ID: " + id);
            System.out.print(", Name: " + name);
            System.out.println(", Country: " + country);
        }
    }
}

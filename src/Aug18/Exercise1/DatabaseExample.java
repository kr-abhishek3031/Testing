package Aug18.Exercise1;

import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.Statement;

public class DatabaseExample {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/Desktop/Java/test";
    static final  String USER ="sa";
    static final  String PASS ="";
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


            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

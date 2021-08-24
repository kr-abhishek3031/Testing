package Aug19.Exercise2.Dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateStudentTable {
    private static final String CREATE_TABLE = "CREATE TABLE Student " +
            "(  ID int not NULL,"
            + "Name varchar(255),"
            + "Email varchar(255),"
            + "Program varchar(255),"
            +"PRIMARY KEY ( ID )) ";

    public static void main(String[] args) {
        System.out.println(CREATE_TABLE);
        // Step 1: Establishing a Connection
        try (Connection connection = ConnectionFactory.getPGConnection();
             // Step 2:Create a statement using connection object
             Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            statement.execute(CREATE_TABLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

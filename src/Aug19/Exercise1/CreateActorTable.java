package Aug19.Exercise1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateActorTable {
    private static final String CREATE_TABLE = "CREATE TABLE ProductCatalog " +
            "(  id bigint not NULL,"
            + "Name varchar(255),"
            + "Price float,"
            + "Quantity bigint,"
            +"PRIMARY KEY ( id )) ";

    public static void main(String[] args) {
        System.out.println(CREATE_TABLE);
        // Step 1: Establishing a Connection
        try (Connection connection = ConnectionFactory.getConnection();
             // Step 2:Create a statement using connection object
             Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            statement.execute(CREATE_TABLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


package Aug18.Exercise2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateActorTable {
    private static final String CREATE_TABLE = "CREATE TABLE Actors " +
            "(  ActorID int not NULL,"
            + "Name varchar(255),"
            + "Country varchar(255),"
            +"PRIMARY KEY ( ActorID )) ";

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


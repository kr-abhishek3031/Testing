package Aug19.Exercise1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Actors {
    //private static final String INSERT_ACTORS_SQL = "INSERT INTO Actors" + "  (actorid, name, country) VALUES " + " (?, ?, ?);";
    private static final String INSERT_ACTORS_SQL = "INSERT INTO Actors VALUES(?, ?, ?)";
    public static void main(String[] argv) throws SQLException {
        Actors insertActor = new Actors();
        insertActor.insertRecord(3, "Actor2", "Australia");
    }

    public void insertRecord(int actorId, String actorName, String country) throws SQLException {
        System.out.println(INSERT_ACTORS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = ConnectionFactory.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement ps = connection.prepareStatement(INSERT_ACTORS_SQL)) {
            //prepared statement allows us to use the template multiple times.
            ps.setInt(1, actorId);
            ps.setString(2, actorName);
            ps.setString(3, country);

            System.out.println(ps);
            // Step 3: Execute the query or update query
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

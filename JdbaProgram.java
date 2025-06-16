package xyz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;



public class JdbaProgram {
    public static void main(String[] args) {
        // JDBC URL, username and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root"; // change this to your MySQL username
        String password = ""; // change this to your MySQL password

        // SQL query to create table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS students ("
                + "id INT PRIMARY KEY, "
                + "name VARCHAR(100), "
                + "marks INT"
                + ")";

        try {
            // Load MySQL JDBC Driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute the query
            stmt.executeUpdate(createTableSQL);

            System.out.println("Table 'students' created successfully in database 'studentdb'.");

            // Close connections
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
 
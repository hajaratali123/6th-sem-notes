import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String JDBC_USER = "your_username";
    private static final String JDBC_PASSWORD = "your_password";

    // JDBC variables for opening and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        try {
            // Connect to the MySQL database
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Insert a new record into the employees table
            insertEmployee("John Doe", 30, "IT");

            // Print all records from the employees table
            printEmployees();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close JDBC objects in finally block to ensure they're closed even if an exception is thrown
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void insertEmployee(String name, int age, String department) throws SQLException {
        // SQL query to insert a new record into the employees table
        String sql = "INSERT INTO employees (name, age, department) VALUES (?, ?, ?)";
        preparedStatement = connection.prepareStatement(sql);

        // Set parameters for the preparedStatement
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.setString(3, department);

        // Execute the query
        int rowsInserted = preparedStatement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new employee was inserted successfully!");
        }
    }

    private static void printEmployees() throws SQLException {
        // SQL query to select all records from the employees table
        String sql = "SELECT id, name, age, department FROM employees";
        preparedStatement = connection.prepareStatement(sql);

        // Execute the query and get the ResultSet
        resultSet = preparedStatement.executeQuery();

        // Iterate through the ResultSet and print each employee's information
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String department = resultSet.getString("department");

            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department);
        }
    }
}

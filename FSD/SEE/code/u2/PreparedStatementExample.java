import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String JDBC_USER = "your_username";
    private static final String JDBC_PASSWORD = "your_password";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Connect to the MySQL database
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // SQL query with parameters
            String sql = "SELECT * FROM employees WHERE department = ?";
            
            // Create a PreparedStatement with parameterized query
            preparedStatement = connection.prepareStatement(sql);
            
            // Set parameters dynamically
            preparedStatement.setString(1, "IT");

            // Execute the query
            resultSet = preparedStatement.executeQuery();

            // Process the ResultSet
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String department = resultSet.getString("department");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}

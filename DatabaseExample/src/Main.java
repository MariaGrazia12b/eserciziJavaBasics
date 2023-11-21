import java.sql.*;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //ESERCIZIO TABLES
        // db parameters
        String url       = "jdbc:mysql://localhost:3306/newdb";
        String user      = "developer";
        String password  = "passwordhere";

        try(Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement statement = conn.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS students (" +
                    "student_id INT (10) NOT NULL AUTO_INCREMENT, " +
                    "last_name VARCHAR (30)," +
                    "first_name VARCHAR (30)," +
                    "PRIMARY KEY (student_id)" +
                    ");"
            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try(Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO students (last_name, first_name) " +
                    "VALUES ('Rossi', 'Mario')," +
                    "('Bianchi', 'Andrea')," +
                    "('Verdi', 'Giulia')," +
                    "('Neri', 'Paola'), " +
                    "('Rossi', 'Micol'); "

            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        //ESERCIZIO SELECT:
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement statement = conn.createStatement();
            String query = "SELECT last_name, first_name FROM students";
            ResultSet rs = statement.executeQuery(query);
            ArrayList<String> surnames = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString(2);
                String surname = rs.getString(1);
                surnames.add(surname);
                System.out.println("Name: " + name);
            }
            System.out.println("Lista cognomi: " + surnames);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //ESERCIZIO ALTER
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement statement = conn.createStatement();
            statement.execute("ALTER TABLE students " +
                    "ADD COLUMN country VARCHAR(30)");
            statement.executeUpdate("UPDATE students  SET country = 'Italy' " +
                    "WHERE student_id = 1 OR student_id = 2");
            statement.executeUpdate("UPDATE students  SET country = 'Germany' " +
                    "WHERE student_id = 3 OR student_id = 4");
        } catch (Exception e) {
        e.printStackTrace();
        }
    }

}
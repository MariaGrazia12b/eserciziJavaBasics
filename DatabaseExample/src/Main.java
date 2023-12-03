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

        /*
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
        */

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
       /* try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement statement = conn.createStatement();
            statement.execute("ALTER TABLE students " +
                    "ADD COLUMN country VARCHAR(30)");
            statement.executeUpdate("UPDATE students  SET country = 'Italy' " +
                    "WHERE student_id = 1 OR student_id = 2");
            statement.executeUpdate("UPDATE students  SET country = 'Germany' " +
                    "WHERE student_id = 3 OR student_id = 4");
        } catch (Exception e) {
              e.printStackTrace();
        } */

        //ESERCIZIO VIEWS
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement statement = conn.createStatement();
            String queryItalianView = "CREATE VIEW italian_students AS SELECT last_name, first_name FROM students " +
                    "WHERE country = 'italy';";
            int ris = statement.executeUpdate(queryItalianView);



            String queryGermanView = "CREATE VIEW german_students AS SELECT last_name, first_name FROM students " +
                    "WHERE country = 'germany';";
            int ris2 = statement.executeUpdate(queryGermanView); 

            String queryitalianStudents = "SELECT * FROM italian_students;";
            ResultSet result = statement.executeQuery(queryitalianStudents);
            ArrayList<Student> italianStudents = new ArrayList<>();
            System.out.println("Gli studenti italiani sono:");
            while (result.next()) {
                String name = result.getString(2);
                String surname = result.getString(1);
                Student student = new Student(name, surname);
                italianStudents.add(student);
                System.out.println(student);
            }

            System.out.println();

            String queryGermanStudents = "SELECT * FROM german_students;";
            ResultSet result1 = statement.executeQuery(queryGermanStudents);
            ArrayList<Student> germanStudents = new ArrayList<>();
            System.out.println("Gli studenti tedeschi sono:");
            while (result1.next()) {
                String name = result1.getString(2);
                String surname = result1.getString(1);
                Student student = new Student(name, surname);
                germanStudents.add(student);
                System.out.println(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
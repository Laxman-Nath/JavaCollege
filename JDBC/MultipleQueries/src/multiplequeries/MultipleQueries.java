package multiplequeries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

public class MultipleQueries {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_db?allowMultipleQueries=true", "root", "siddha@123");
            return conn;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void executeMultipleQueries(Connection conn) {
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT *FROM student WHERE age>20;SELECT *FROM student WHERE age<20;";
            boolean results = stm.execute(sql);
            do {
                
                ResultSet rs = stm.getResultSet();

                while (rs.next()) {
                    System.out.println("Id:" + rs.getString("id"));
                    System.out.println("Name:" + rs.getString("name"));
                    System.out.println("District:" + rs.getString("district"));
                    System.out.println("Age:" + rs.getString("age"));
                }

                results = stm.getMoreResults();
            } while (results);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {

        executeMultipleQueries(getConnection());
    }

}

package jdbcrowset;

import java.sql.Connection;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcRowSetDemo {

    public static void show() {
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_db", "root", "siddha@123");
//            return conn;
            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            JdbcRowSet jdbcRowSet = rowSetFactory.createJdbcRowSet();
//            jdbcRowSet.setURL("jdbc:mysql://localhost:3306/exam_db");
            jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/exam_db");
            jdbcRowSet.setUsername("root");
            jdbcRowSet.setPassword("siddha@123");
            jdbcRowSet.setCommand("SELECT * FROM student");
            jdbcRowSet.execute();

            while (jdbcRowSet.next()) {
                System.out.println("Id:" + jdbcRowSet.getString("id"));
                System.out.println("Name:" + jdbcRowSet.getString("name"));
                System.out.println("District:" + jdbcRowSet.getString("district"));
                System.out.println("Age:" + jdbcRowSet.getString("age"));

            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
       
    }



    public static void main(String[] args) {
       show();
    }

}

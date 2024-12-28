package cachedrowset;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetDemo {

    public static void show() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_db", "root", "siddha@123");
//            return conn;
            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            CachedRowSet cachedRowSet = rowSetFactory.createCachedRowSet();
//            jdbcRowSet.setURL("jdbc:mysql://localhost:3306/exam_db");
            cachedRowSet.setUrl("jdbc:mysql://localhost:3306/exam_db");
            cachedRowSet.setUsername("root");
            cachedRowSet.setPassword("siddha@123");
            cachedRowSet.setCommand("SELECT * FROM student");
            cachedRowSet.execute();

            while (cachedRowSet.next()) {
                System.out.println("Id:" + cachedRowSet.getString("id"));
                System.out.println("Name:" + cachedRowSet.getString("name"));
                System.out.println("District:" + cachedRowSet.getString("district"));
                System.out.println("Age:" + cachedRowSet.getString("age"));

            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static void main(String[] args) {
        show();
    }

}

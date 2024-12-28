package pkg2072oldques;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_db", "root", "siddha@123");
            return conn;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return null;
    }

    public static int insertData(Connection conn) {
        try {
            /*       Statement stm = conn.createStatement();
              String query="INSERT INTO Student (name,district,age)  VALUES ('laxman','daijee',23)";
int affectedRows = stm.executeUpdate(query);
            if (affectedRows > 0) {
                return affectedRows; 

            }
             */
//            Scanner sc = new Scanner(System.in);
//            Statement stm = conn.createStatement();
//           System.out.println("Enter name:");
//            String name = sc.nextLine();
//            System.out.println("Enter district");
//            String district = sc.nextLine();
//            System.out.println("Enter age:");
//            int age = sc.nextInt();
//            String query="INSERT INTO Student (name,district,age) VALUES ('"+name+"','"+district+"',"+age+")";
//            int affectedRows = stm.executeUpdate(query);
//            if (affectedRows > 0) {
//                return affectedRows;
//
//            }

            PreparedStatement ps = conn.prepareStatement("INSERT INTO Student(name,district,age) VALUES (?,?,?)");
            Scanner sc = new Scanner(System.in);
            Statement stm = conn.createStatement();
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter district");
            String district = sc.nextLine();
            System.out.println("Enter age:");
            int age = sc.nextInt();
            ps.setString(1, name);
            ps.setString(2, district);
            ps.setInt(3, age);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                return affectedRows;
//
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static void printStudentFromKathmandu(Connection conn) throws SQLException {
        Statement stm = conn.createStatement();
        String query = "SELECT * FROM Student WHERE district='kathmandu'";
        ResultSet rs = stm.executeQuery(query);
        int count = 0;
        while (rs.next()) {
            System.out.println("Information of student " + count + 1);
            System.out.println("Id:" + rs.getInt("id"));
            System.out.println("Name:" + rs.getString("name"));
            System.out.println("District:" + rs.getString("district"));
            System.out.println("Age:" + rs.getInt("age"));
            count++;
        }

    }

    public static void main(String[] args) throws Exception{
        Connection conn = getConnection();
//        System.out.println("Affected rows:" + insertData(conn));
            printStudentFromKathmandu(conn);
    }

}

/* Write a java program using jdbc to extract those students who lives in kathmandu(2072) */
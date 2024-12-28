package jdbc2080;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
Assume a table named MOVIE(id,title,genre).Now using jdbc,perform the follwing operations:
a.Add any three records to the MOVIE table.
b.using prepared statement update the genre to "Comedy" having title jatra.
 */
public class JDBC2080 {

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

    public static int insertData(Connection conn) throws Exception {
        Scanner sc = new Scanner(System.in);
        PreparedStatement ps = conn.prepareStatement("INSERT INTO MOVIE(title,genre) VALUES (?,?)");
        System.out.println("Enter title");
        ps.setString(1, sc.nextLine());
        System.out.println("Enter genre");
        ps.setString(2, sc.nextLine());
        int affectedRows = ps.executeUpdate();
        return affectedRows > 0 ? affectedRows : 0;

    }
    
    public static int updateRow(
    Connection conn) throws Exception{
        PreparedStatement ps = conn.prepareStatement("UPDATE MOVIE SET genre=? WHERE title=?");
        ps.setString(1, "comedy");
        ps.setString(2, "jatra");
        int affectedRows = ps.executeUpdate();
        return affectedRows > 0 ? affectedRows : 0;
    }

    public static void main(String[] args) throws  Exception{
        
   Connection conn=getConnection();
//     for(int i=0;i<3;i++){
//         insertData(conn);
//    }

       System.out.println( updateRow(conn));
    }

}

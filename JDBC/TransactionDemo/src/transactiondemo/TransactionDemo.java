/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transactiondemo;
import java.sql.*;

public class TransactionDemo {

   public static void insert() {
       Connection conn=null;
       try{
       Class.forName("com.mysql.cj.jdbc.Driver");
      conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_db","root","siddha@123");
       conn.setAutoCommit(false);
       Statement stm=conn.createStatement();
       String sql1="INSERT INTO student(name,district,age) VALUES('bikash','ban',34)";
       String sql2="INSERT INTO student(name,district,age) VALUES('suresh','ban',34)";
       stm.executeUpdate(sql1);
       stm.executeUpdate(sql2);
       conn.commit();
       }
       catch(Exception e){
           System.out.println(e.getMessage());
           conn.rollback();
       }
       
   }
    public static void main(String[] args) {
        insert();
    }
    
}

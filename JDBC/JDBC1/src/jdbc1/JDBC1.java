package jdbc1;

import java.sql.*;

public class JDBC1 {
    
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_db", "root", "siddha@123");
        return conn;
    }
    
    public static int insertData(Connection conn) throws Exception {
        Statement stm = conn.createStatement();
        String sql = "INSERT INTO jdbc1(name,address,age) VALUES('laxman','mnr',20)";
        int affectedRows = stm.executeUpdate(sql);
        if (affectedRows > 0) {
            return 1;
        }
        
        return 0;
        
    }
    
    public static int deleteData(Connection conn) throws Exception {
        PreparedStatement stm = conn.prepareStatement("DELETE FROM jdbc1 WHERE id=?");
        stm.setInt(1, 1);
        int affectedRows = stm.executeUpdate();
        if (affectedRows > 0) {
            return 1;
        }
        
        return 0;
    }
    
    public static int updateData(Connection conn) throws Exception {
        PreparedStatement stm = conn.prepareStatement("UPDATE jdbc1 SET name=?,address=?,age=? WHERE id=?");
        stm.setString(1, "rohit");
        stm.setString(2, "chaumala");
        stm.setInt(3, 34);
        stm.setInt(4, 1);
        int affectedRows = stm.executeUpdate();
        if (affectedRows > 0) {
            return 1;
        }
        
        return 0;
    }
    
    public static void insertAtFirstUpdatableScrollResultSet(Connection conn) throws Exception {
        Statement ps = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM  jdbc1";
        ResultSet rs = ps.executeQuery(sql);
        
        rs.beforeFirst();
        rs.moveToInsertRow();
        rs.updateInt("id", 1);
        rs.updateString("name", "bikash");
        rs.updateString("address", "bangaun");
        rs.updateInt("age", 20);
        rs.insertRow();
        rs.beforeFirst();
    }
    
    public static void insertAtSecondUpdatableScrollResultSet(Connection conn) throws Exception {
        Statement ps = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM  jdbc1";
        ResultSet rs = ps.executeQuery(sql);
        
        if (rs.next()) {
            rs.next();
            
            rs.moveToInsertRow();
            rs.updateInt("id", 2);
            rs.updateString("name", "bhim");
            rs.updateString("address", "tikapur");
            rs.updateInt("age", 50);
            rs.insertRow();
            rs.beforeFirst();
        }
    }
    
    public static void insertAtIndex(Connection conn) throws Exception {
        Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stm.executeQuery("SELECT * FROM jdbc1");
        rs.absolute(3);
        rs.moveToInsertRow();
        rs.updateInt("id", 3);
        rs.updateString("name", "bhim");
        rs.updateString("address", "tikapur");
        rs.updateInt("age", 50);
        rs.insertRow();
        rs.beforeFirst();
    }
    
    public static void updateAtSecondUpdatableScrollResultSet(Connection conn) throws Exception {
        Statement ps = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM  jdbc1";
        ResultSet rs = ps.executeQuery(sql);
        
        if (rs.next()) {
            rs.next();

//            rs.updateInt("id", 2);
            rs.updateString("name", "bibek");
            rs.updateString("address", "airee");
            rs.updateInt("age", 20);
            rs.updateRow();
            rs.beforeFirst();
            
        }
    }
    
    public static void deleteAtFirstUpdatableScrollResultSet(Connection conn) throws Exception {
        Statement ps = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM  jdbc1";
        ResultSet rs = ps.executeQuery(sql);
        rs.next();
        
        rs.deleteRow();
        rs.beforeFirst();
    }
    
    public static void deleteAtLastUpdatableScrollResultSet(Connection conn) throws Exception {
        Statement ps = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM  jdbc1";
        ResultSet rs = ps.executeQuery(sql);
        rs.last();
        
        rs.deleteRow();
        rs.beforeFirst();
    }
    
    public static void show(Connection connection) throws Exception {
        Statement ps = connection.createStatement();
        String sql = "SELECT * FROM  jdbc1";
        ResultSet rs = ps.executeQuery(sql);
        while (rs.next()) {
            System.out.println("Id:" + rs.getInt("id"));
            System.out.println("Name:" + rs.getString("name"));
            System.out.println("Address:" + rs.getString("address"));
            System.out.println("Age:" + rs.getInt("age"));
        }
    }
    
    public static void main(String[] args) throws Exception {

//       System.out.println(insertData(getConnection()));
//System.out.println(updateData(getConnection()));
//        System.out.println(deleteData(getConnection()));
//insertAtFirstUpdatableScrollResultSet(getConnection());
//        show(getConnection());
//insertAtSecondUpdatableScrollResultSet(getConnection());
//updateAtSecondUpdatableScrollResultSet(getConnection());
//        deleteAtFirstUpdatableScrollResultSet(getConnection());
//        insertAtIndex(getConnection());
        deleteAtLastUpdatableScrollResultSet(getConnection());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * Trả về thông tin kết nối đến cơ sở dữ liệu
 * and open the template in the editor.
 */
package Data;

import java.sql.*;
import com.mysql.jdbc.Connection;

/**
 *
 * @author TIE - BREAK
 */
public class DBprovider {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URl = "jdbc:mysql://localhost:3306/pksa";

    public static Connection ketnoi() {
        Connection conn = null;
        try {
            // nạp driver down về
            Class.forName(JDBC_DRIVER);
            // khởi tạo kết nối
            conn = (Connection) DriverManager.getConnection(DATABASE_URl, "root", "password");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Có lỗi xảy ra. Chi tiết: " + ex.getMessage());
        }
        return conn;
    }

//    public static Connection getConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}

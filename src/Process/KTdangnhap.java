/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Data.DBprovider;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TIE - BREAK
 */
public class KTdangnhap {

    public static Connection conn = null;
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;

    public static String testConnect() {
        try {
            conn = DBprovider.ketnoi();
            return "Kết nối cơ sở dữ liệu thành công";
        } catch (Exception e) {
            return " Kết nối cơ sở dữ liệu thất bại";
        }
    }

    public static ResultSet dangnhap(String user, String pass) {
        String sql = "SELECT * FROM pksa.tbdangnhap where tendangnhap=? and matkhau=?";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);
            return rs = pst.executeQuery();
        } catch (SQLException e) {
            return rs = null;
        }

    }

    public static ResultSet cLog(String text, String valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

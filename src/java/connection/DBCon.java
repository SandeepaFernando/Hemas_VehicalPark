/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandeepa Fernando
 */
public class DBCon {

    private String url = "jdbc:mysql://localhost:3306/hemas_database";
    private String uName = "root";
    private String pw = "";
    static Connection con = null;

    public DBCon() {
    }

    public boolean isConnected() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, uName, pw);

        if (con != null) {
            return true;
        } else {
            return false;
        }
    }

    public static Connection getCon() {

        return con;
    }
}

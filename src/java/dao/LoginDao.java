/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DBCon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sandeepa Fernando
 */
public class LoginDao {

    private String utype, uname, passw;
    private DBCon db = new DBCon();
    private Connection newCon = null;

    public LoginDao(String utype, String uname, String passw) {
        this.utype = utype;
        this.uname = uname;
        this.passw = passw;
    }

    public boolean check() throws ClassNotFoundException, SQLException {

        if (db.isConnected()) {
            newCon = DBCon.getCon();

            Statement stmt = newCon.createStatement();

            String query = "SELECT u.utype, u.uname, p.upassword FROM user u, permanent p WHERE u.utype = '"+utype+"' AND u.uname = '"+uname+"' AND p.upassword = '"+passw+"'";
            ResultSet re = stmt.executeQuery(query);

            if (re.next()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

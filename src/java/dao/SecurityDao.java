/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Security;
import bean.User;
import connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import queries.SecurityQueries;
import queries.UserQueries_permanent;

/**
 *
 * @author Sandeepa Fernando
 */
public class SecurityDao {

    public Connection getConnection() {
        DBConnection dbcon = DBConnection.getInstance();
        Connection con = dbcon.getCon();

        return con;
    }

    public boolean insertUser(Security user) {
        Connection con = getConnection();
        int result = 0;
        int resultUser = 0;
        int userID;
        ResultSet result_Id = null;

        try {
            PreparedStatement pst1 = con.prepareStatement(SecurityQueries.INSERT_SECURITY);
            pst1.setString(1, user.getUtype());
            pst1.setString(2, user.getUemail());
            pst1.setString(3, user.getUname());
            pst1.setString(4, user.getUaddress());

            resultUser = pst1.executeUpdate();

            if (resultUser > 0) {
                PreparedStatement pst2 = con.prepareStatement(SecurityQueries.GET_LAST_SECURITY_ID);
                result_Id = (ResultSet) pst2.executeQuery();
                while (result_Id.next()) {
                    user.setId(result_Id.getInt("user_Id"));
                }

                PreparedStatement pst = con.prepareStatement(SecurityQueries.INSERT_SECURITY_PASS);
                pst.setInt(1, user.getId());
                pst.setString(2, user.getPassword());

                PreparedStatement pst3 = con.prepareStatement(SecurityQueries.INSERT_SECURITY_WHR);
                pst3.setInt(1, user.getId());
                pst3.setInt(2, user.getWhrs());
                result = pst3.executeUpdate();

                result = pst.executeUpdate();

            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return (result > 0);
    }

    public List<Security> getAllUsers() {
        Connection con = getConnection();
        ResultSet result = null;
        ResultSet resultpass = null;
        List<Security> userList = new ArrayList<>();

        try {

            PreparedStatement pst = con.prepareStatement(SecurityQueries.GET_ALL_SECURITY);

            PreparedStatement pst1 = con.prepareStatement(SecurityQueries.GET_ALL_SECURITY_PASS);

            result = pst.executeQuery();

            while (result.next()) {
                Security sUser = new Security();

                sUser.setId(result.getInt(1));
                sUser.setUtype(result.getString(2));
                sUser.setUemail(result.getString(3));
                sUser.setUname(result.getString(4));
                sUser.setUaddress(result.getString(5));

                pst1.setInt(1, result.getInt(1));
                resultpass = pst1.executeQuery();

                //registeredUser.setPassword(resultpass.getString("upassword"));
                while (resultpass.next()) {
                    sUser.setPassword(resultpass.getString("upassword"));
                }

                userList.add(sUser);

            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return userList;
    }

    public User getUser(int id) {
        Connection con = getConnection();
        ResultSet result = null;
        User user = new User();

        try {

            PreparedStatement pst = con.prepareStatement(SecurityQueries.GET_SECURITY_BY_ID);
            pst.setInt(1, id);

            result = pst.executeQuery();

            while (result.next()) {
                user.setId(result.getInt(1));
                user.setUtype(result.getString(2));
                user.setUname(result.getString(3));
                user.setUemail(result.getString(4));
                user.setUaddress(result.getString(5));
                user.setPassword(result.getString(6));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return user;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.User;
import connection.DBConnection;
import queries.UserQueries_permanent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author Sandeepa Fernando
 */
public class UserDao {

    public Connection getConnection() {
        DBConnection dbcon = DBConnection.getInstance();
        Connection con = dbcon.getCon();

        return con;
    }

    public boolean insertUser(User user) {
        Connection con = getConnection();
        int result = 0;
        int resultUser = 0;
        int userID;
        ResultSet result_Id = null;

        try {
            PreparedStatement pst1 = con.prepareStatement(UserQueries_permanent.INSERT_USER);
            pst1.setString(1, user.getUtype());
            pst1.setString(2, user.getUemail());
            pst1.setString(3, user.getUname());
            pst1.setString(4, user.getUaddress());

            resultUser = pst1.executeUpdate();

            if (resultUser > 0) {
                PreparedStatement pst2 = con.prepareStatement(UserQueries_permanent.GET_LAST_USER_ID);
                result_Id = (ResultSet) pst2.executeQuery();
                while (result_Id.next()) {
                    user.setId(result_Id.getInt("user_Id"));
                }

                PreparedStatement pst = con.prepareStatement(UserQueries_permanent.INSERT_User_permanent);
                pst.setInt(1, user.getId());
                pst.setString(2, user.getPassword());

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

    public List<User> getAllUsers() {
        Connection con = getConnection();
        ResultSet result = null;
        ResultSet resultpass = null;
        List<User> userList = new ArrayList<>();

        try {

            PreparedStatement pst = con.prepareStatement(UserQueries_permanent.GET_ALL_USERS);

            PreparedStatement pst1 = con.prepareStatement(UserQueries_permanent.GET_ALL_USERS_PASS);

            result = pst.executeQuery();

            while (result.next()) {
                User registeredUser = new User();

                registeredUser.setId(result.getInt(1));
                registeredUser.setUtype(result.getString(2));
                registeredUser.setUemail(result.getString(3));
                registeredUser.setUname(result.getString(4));
                registeredUser.setUaddress(result.getString(5));

                pst1.setInt(1, result.getInt(1));
                resultpass = pst1.executeQuery();

                //registeredUser.setPassword(resultpass.getString("upassword"));
                while (resultpass.next()) {
                    registeredUser.setPassword(resultpass.getString("upassword"));
                }

                userList.add(registeredUser);

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

            PreparedStatement pst = con.prepareStatement(UserQueries_permanent.GET_USER_BY_ID);
            pst.setInt(1, id);

            result = pst.executeQuery();

            while (result.next()) {
                user.setId(result.getInt(1));
                user.setUtype(result.getString(2));
                user.setUname(result.getString(3));
                user.setUemail(result.getString(4));
                user.setUaddress(result.getString(5));
                user.setPassword(result.getString(6));
//                user.setVehicalno(result.getString(5));
//                user.setEmail(result.getString(6));
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

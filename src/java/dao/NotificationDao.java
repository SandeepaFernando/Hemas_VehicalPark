/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Notification;
import connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import queries.NotificationQueries;

/**
 *
 * @author Sandeepa Fernando
 */
public class NotificationDao {

    public Connection getConnection() {
        DBConnection dbcon = DBConnection.getInstance();
        Connection con = dbcon.getCon();

        return con;
    }

    public boolean insertNotification(Notification noti) {
        Connection con = getConnection();
        int result = 0;

        try {
            PreparedStatement pst1 = con.prepareStatement(NotificationQueries.INSERT_NOTIFICATION);
            //pst1.setInt(1, noti.getNot_Id());
            pst1.setString(1, noti.getNot_type());
            pst1.setString(2, noti.getNot_desc());
            pst1.setInt(3, noti.getUser_Id());

            result = pst1.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return (result > 0);
    }

    public List<Notification> getAllNotification() {
        Connection con = getConnection();
        ResultSet result = null;
        List<Notification> notifiList = new ArrayList<>();

        try {

            PreparedStatement pst = con.prepareStatement(NotificationQueries.GET_ALL_NOTIFICATION);

            result = pst.executeQuery();

            while (result.next()) {
                Notification notifi = new Notification();

                notifi.setNot_Id(result.getInt(1));
                notifi.setNot_type(result.getString(2));
                notifi.setNot_desc(result.getString(3));
                notifi.setUser_Id(result.getInt(4));

                notifiList.add(notifi);

            }

        } catch (SQLException ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return notifiList;
    }

    public Notification getNotificationById(int id) {
        Connection con = getConnection();
        ResultSet result = null;
        Notification user = new Notification();

        try {

            PreparedStatement pst = con.prepareStatement(NotificationQueries.GET_NOTIFICATION_BY_ID);
            pst.setInt(1, id);

            result = pst.executeQuery();

            while (result.next()) {
                user.setNot_Id(result.getInt(1));
                user.setNot_type(result.getString(2));
                user.setNot_desc(result.getString(3));
                user.setUser_Id(result.getInt(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return user;
    }

    public boolean updateNotification(Notification noitifi) {
        Connection con = getConnection();
        int result = 0;

        try {

            PreparedStatement pst = con.prepareStatement(NotificationQueries.UPDATE_NOTIFICATION);
            pst.setString(1, noitifi.getNot_type());
            pst.setString(2, noitifi.getNot_desc());
            pst.setInt(3, noitifi.getNot_Id());

            result = pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return (result > 0);
    }

    public boolean deleteNotification(int id) {
        Connection con = getConnection();
        int result = 0;

        try {

            PreparedStatement pst = con.prepareStatement(NotificationQueries.DELETE_NOTIFICATION);
            pst.setInt(1, id);

            result = pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return (result > 0);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Notification;
import bean.Registered;
import connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import queries.NotificationQueries;
import queries.RegisteredQueries;

/**
 *
 * @author Sandeepa Fernando
 */
public class RegisteredDao {

    public Connection getConnection() {
        DBConnection dbcon = DBConnection.getInstance();
        Connection con = dbcon.getCon();

        return con;
    }

    public boolean insertReservation(Registered reg) {
        Connection con = getConnection();
        int result = 0;

        try {
            PreparedStatement pst1 = con.prepareStatement(RegisteredQueries.INSERT);
            //pst1.setInt(1, noti.getNot_Id());
            pst1.setInt(1, reg.getUser_Id());
            pst1.setString(2, reg.getRVehicleNo());
            pst1.setString(3, reg.getRNIC());

            result = pst1.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RegisteredDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RegisteredDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return (result > 0);
    }

    public boolean editeReservation(int id) {
        Connection con = getConnection();
        int result = 0;
        //Time time= (Time) new java.util.Date();
        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());

        try {

            PreparedStatement pst = con.prepareStatement(RegisteredQueries.UPDATE);
            pst.setTimestamp(1, date);
            pst.setInt(2, id);

            result = pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RegisteredDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RegisteredDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return (result > 0);
    }

    public List<Registered> getAllReservation() {
        Connection con = getConnection();
        ResultSet result = null;
        ResultSet resultpass = null;
        List<Registered> resList = new ArrayList<>();

        try {

            PreparedStatement pst = con.prepareStatement(RegisteredQueries.GET_ALL);
            result = pst.executeQuery();

            while (result.next()) {
                Registered reg = new Registered();

                reg.setUser_Id(result.getInt(1));
                reg.setRVehicleNo(result.getString(2));
                reg.setRNIC(result.getString(3));
                reg.setRArrivedTime(result.getTimestamp(4));
                //reg.setRLeavedTime(result.getTimestamp(5));

                resList.add(reg);

            }

        } catch (SQLException ex) {
            Logger.getLogger(RegisteredDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RegisteredDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return resList;
    }

    public int getdiff(int id) {
        double diff = 0.0;
        Connection con = getConnection();
        ResultSet result = null;
        Timestamp t1 = null;
        Timestamp t2 = null;

        try {

            PreparedStatement pst = con.prepareStatement(RegisteredQueries.GET_TIME_BYID);
            pst.setInt(1, id);
            result = pst.executeQuery();

            while (result.next()) {
                t1 = result.getTimestamp("RArrivedTime");
                t2 = result.getTimestamp("RLeavedTime");
            }

            long milliseconds = t1.getTime() - t2.getTime();
            int seconds = (int) milliseconds / 1000;

            // calculate hours minutes and seconds
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;

            diff = hours + minutes;
            System.out.println(diff);

        } catch (SQLException ex) {
            Logger.getLogger(RegisteredDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RegisteredDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return (int) diff;
    }
}

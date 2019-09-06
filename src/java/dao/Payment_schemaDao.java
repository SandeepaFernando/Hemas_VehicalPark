/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Payment_schema;
import connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import queries.Payment_schemaQueries;

/**
 *
 * @author Sandeepa Fernando
 */
public class Payment_schemaDao {

    public Connection getConnection() {
        DBConnection dbcon = DBConnection.getInstance();
        Connection con = dbcon.getCon();

        return con;
    }

    public boolean insertPayment_schema(Payment_schema payment) {
        Connection con = getConnection();
        int result = 0;

        try {
            PreparedStatement pst1 = con.prepareStatement(Payment_schemaQueries.INSERT_PAYMENT_SCHEMA);
            pst1.setString(1, payment.getPs_name());
            pst1.setDouble(2, payment.getPs_rate());
            pst1.setString(3, payment.getPs_desc());

            result = pst1.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Payment_schemaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Payment_schemaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return (result > 0);
    }

    public List<Payment_schema> getAllPayment_schema() {
        Connection con = getConnection();
        ResultSet result = null;
        List<Payment_schema> paymentList = new ArrayList<>();

        try {

            PreparedStatement pst = con.prepareStatement(Payment_schemaQueries.GET_ALL_PAYMENT_SCHEMA);

            result = pst.executeQuery();

            while (result.next()) {
                Payment_schema schema = new Payment_schema();

                schema.setPsId(result.getInt(1));
                schema.setPs_name(result.getString(2));
                schema.setPs_rate(result.getDouble(3));
                schema.setPs_desc(result.getString(4));

                paymentList.add(schema);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Payment_schemaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Payment_schemaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return paymentList;
    }

    public Payment_schema getPayment_schemaById(int id) {
        Connection con = getConnection();
        ResultSet result = null;
        Payment_schema schema = new Payment_schema();

        try {

            PreparedStatement pst = con.prepareStatement(Payment_schemaQueries.GET_PAYMENT_SCHEMA_BY_ID);
            pst.setInt(1, id);

            result = pst.executeQuery();

            while (result.next()) {
                schema.setPsId(result.getInt(1));
                schema.setPs_name(result.getString(2));
                schema.setPs_rate(result.getDouble(3));
                schema.setPs_desc(result.getString(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Payment_schemaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Payment_schemaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return schema;
    }

    public boolean updatePayment_schema(Payment_schema schema) {
        Connection con = getConnection();
        int result = 0;

        try {

            PreparedStatement pst = con.prepareStatement(Payment_schemaQueries.UPDATE_PAYMENT_SCHEMA);   
            pst.setString(1, schema.getPs_name());
            pst.setDouble(2, schema.getPs_rate());
            pst.setString(3, schema.getPs_desc());
            pst.setInt(4, schema.getPsId());
            

            result = pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Payment_schemaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Payment_schemaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return (result > 0);
    }

    public boolean deletePayment_schema(int id) {
        Connection con = getConnection();
        int result = 0;

        try {

            PreparedStatement pst = con.prepareStatement(Payment_schemaQueries.DELETE_PAYMENT_SCHEMA);
            pst.setInt(1, id);

            result = pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Payment_schemaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Payment_schemaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return (result > 0);
    }
}

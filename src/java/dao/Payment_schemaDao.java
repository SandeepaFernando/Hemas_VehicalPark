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
import java.sql.SQLException;
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
}

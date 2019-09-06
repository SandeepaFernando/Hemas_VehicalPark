/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queries;

/**
 *
 * @author Sandeepa Fernando
 */
public class Payment_schemaQueries {

    public static final String INSERT_PAYMENT_SCHEMA= "Insert Into payment_schema (ps_name, ps_rate,ps_desc) Values (?,?,?)";
    public static final String GET_ALL_PAYMENT_SCHEMA = "SELECT * FROM payment_schema";
    public static final String GET_PAYMENT_SCHEMA_BY_ID = "SELECT * FROM payment_schema where psId = ?";
    public static final String UPDATE_PAYMENT_SCHEMA = "Update payment_schema Set ps_name = ?, ps_rate = ?, ps_desc = ? Where psId = ?";
    public static final String DELETE_PAYMENT_SCHEMA = "Delete From payment_schema Where psId = ?";
}

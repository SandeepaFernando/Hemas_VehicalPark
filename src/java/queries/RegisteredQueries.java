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
public class RegisteredQueries {

    public static final String INSERT = "Insert Into registered(user_Id, RVehicleNo,RNIC) Values (?,?,?)";
    public static final String UPDATE = "Update registered Set RLeavedTime = ? Where user_Id = ?";
    public static final String GET_ALL= "SELECT * FROM registered";
    public static final String GET_TIME_BYID = "SELECT * FROM registered WHERE user_Id = ?";
}

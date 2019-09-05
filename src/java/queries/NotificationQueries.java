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
public class NotificationQueries {

    public static final String INSERT_NOTIFICATION = "Insert Into notification (not_type, not_desc,user_Id) Values (?,?,?)";
    public static final String GET_ALL_NOTIFICATION = "SELECT * FROM notification";
    public static final String GET_NOTIFICATION_BY_ID = "SELECT * FROM notification where not_Id = ?";
    public static final String UPDATE_NOTIFICATION = "Update notification Set not_type = ?, not_desc = ? Where not_Id = ?";
    public static final String DELETE_NOTIFICATION = "Delete From notification Where not_Id = ?";
}

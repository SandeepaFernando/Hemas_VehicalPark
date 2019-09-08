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
public class UserQueries_permanent {
    public static final String INSERT_USER = "Insert Into user (utype, uemail, uname, uaddress) Values (?,?,?,?)";
    public static final String INSERT_User_permanent = "Insert Into permanent (user_Id, upassword) Values (?,?)";
    public static final String GET_LAST_USER_ID = "SELECT * FROM user WHERE utype='user' ORDER BY user_Id DESC LIMIT 1";
    public static final String GET_ALL_USERS = "SELECT * FROM user WHERE utype='user'";
    public static final String GET_ALL_USERS_PASS = "SELECT DISTINCT p.upassword FROM permanent p ,user u where u.user_id = p.user_Id AND u.user_Id = ?";
    public static final String GET_USER_BY_ID = "SELECT DISTINCT u.user_Id,u.utype,u.uname,u.uemail,u.uaddress,p.upassword FROM permanent p ,user u where u.user_id = p.user_Id AND u.user_Id = ?";
    public static final String UPDATE_USER = "Update user Set not_type = ?, not_desc = ? Where not_Id = ?";
    
}

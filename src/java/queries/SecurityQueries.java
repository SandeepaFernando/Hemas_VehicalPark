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
public class SecurityQueries {

    public static final String INSERT_SECURITY = "Insert Into user (utype, uemail, uname, uaddress) Values (?,?,?,?)";
    public static final String INSERT_SECURITY_PASS = "Insert Into permanent (user_Id, upassword) Values (?,?)";
    public static final String INSERT_SECURITY_WHR = "Insert Into security (user_Id, SWhrs) Values (?,?)";
    public static final String GET_LAST_SECURITY_ID = "SELECT * FROM user WHERE utype='admin' ORDER BY user_Id DESC LIMIT 1";
    public static final String GET_ALL_SECURITY = "SELECT * FROM user WHERE utype = 'admin'";
    public static final String GET_ALL_SECURITY_PASS = "SELECT DISTINCT u.user_Id,u.utype,u.uemail,u.uname,u.uaddress,p.upassword FROM permanent p ,user u where u.user_id = p.user_Id AND u.utype ='admin'";
    public static final String GET_SECURITY_BY_ID = "SELECT DISTINCT u.user_Id,u.utype,u.uname,u.uemail,u.uaddress,p.upassword FROM permanent p ,user u where u.user_id = p.user_Id AND u.user_Id = ?";
    public static final String UPDATE_SECURITY = "Update user Set not_type = ?, not_desc = ? Where not_Id = ?";
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Security;
import dao.SecurityDao;
import model.InsertSecurityRequest;
import static services.User_permanent_service.userDao;

/**
 *
 * @author Sandeepa Fernando
 */
public class SecurityService {

    public static SecurityDao userDao = new SecurityDao();

    public static boolean insertUser(InsertSecurityRequest request) {
        Security newuser = new Security();

        newuser.setUtype(request.getUtype());
        newuser.setUemail(request.getUemail());
        newuser.setUname(request.getUname());
        newuser.setUaddress(request.getUaddress());
        newuser.setPassword(request.getPassword());

        return userDao.insertUser(newuser);
    }
}

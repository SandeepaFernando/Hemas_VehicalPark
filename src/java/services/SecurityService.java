/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Security;
import dao.SecurityDao;
import java.util.ArrayList;
import java.util.List;
import model.InsertSecurityRequest;
import model.SecurityRespons;

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
        newuser.setWhrs(request.getWhrs());

        return userDao.insertUser(newuser);
    }

    public static List<SecurityRespons> getAllUser() {
        List<Security> userList = userDao.getAllUsers();
        List<SecurityRespons> responseList = new ArrayList<>();

        for (Security users : userList) {
            SecurityRespons response = new SecurityRespons();

            response.setId(users.getId());
            response.setUname(users.getUname());
            response.setUtype(users.getUtype());
            response.setUemail(users.getUemail());
            response.setUaddress(users.getUaddress());
            response.setPassword(users.getPassword());

            responseList.add(response);
        }

        return responseList;
    }
}

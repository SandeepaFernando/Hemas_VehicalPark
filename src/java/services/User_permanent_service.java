/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.User;
import dao.UserDao;
import java.util.ArrayList;
import java.util.List;
import model.GetUserRequest;
import model.InsertUserRequest;
import model.UserRespons;

/**
 *
 * @author Sandeepa Fernando
 */
public class User_permanent_service {

    public static UserDao userDao = new UserDao();

    public static boolean insertUser(InsertUserRequest request) {
        User newuser = new User();

        newuser.setUtype(request.getUtype());
        newuser.setUemail(request.getUemail());
        newuser.setUname(request.getUname());
        newuser.setUaddress(request.getUaddress());
        newuser.setPassword(request.getPassword());

        return userDao.insertUser(newuser);
    }

    public static List<UserRespons> getAllUser() {
        List<User> userList = userDao.getAllUsers();
        List<UserRespons> responseList = new ArrayList<>();

        for (User users : userList) {
            UserRespons response = new UserRespons();

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

    public static UserRespons getUser(GetUserRequest request) {
        UserRespons response = new UserRespons();
        int id = request.getUser_Id();

        User user = userDao.getUser(id);

        response.setId(user.getId());
        response.setUtype(user.getUtype());
        response.setUname(user.getUname());
        response.setUemail(user.getUemail());
        response.setUaddress(user.getUaddress());
        response.setPassword(user.getPassword());

        return response;
    }
}

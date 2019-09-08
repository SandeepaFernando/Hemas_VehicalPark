/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Notification;
import bean.Registered;
import dao.RegisteredDao;
import java.util.ArrayList;
import java.util.List;
import model.DeleteNotificationRequest;
import model.InsertRegisteredRequest;
import model.RegisteredRespons;
import model.UpdateNotificationRequest;
import model.UpdateRegisteredRequest;
import static services.NotificationService.notiDao;

/**
 *
 * @author Sandeepa Fernando
 */
public class RegisteredService {

    public static RegisteredDao regDao = new RegisteredDao();

    public static boolean insertNotification(InsertRegisteredRequest request) {
        Registered newreg = new Registered();

        // newnoti.setNot_Id(request.getNot_Id());
        newreg.setUser_Id(request.getUser_Id());
        newreg.setRVehicleNo(request.getRVehicleNo());
        newreg.setRNIC(request.getRNIC());

        return regDao.insertReservation(newreg);
    }

    public static List<RegisteredRespons> getAllReservations() {
        List<Registered> notifiList = regDao.getAllReservation();
        List<RegisteredRespons> responseList = new ArrayList<>();

        for (Registered reg : notifiList) {
            RegisteredRespons response = new RegisteredRespons();

            response.setUser_Id(reg.getUser_Id());
            response.setRVehicleNo(reg.getRVehicleNo());
            response.setRNIC(reg.getRNIC());
            response.setRArrivedTime(reg.getRArrivedTime());
            //response.setRLeavedTime(reg.getRLeavedTime());

            responseList.add(response);
        }

        return responseList;
    }

    public static boolean editeReservation(UpdateRegisteredRequest request) {
        int id = request.getUser_Id();

        return regDao.editeReservation(id);
    }
   
}

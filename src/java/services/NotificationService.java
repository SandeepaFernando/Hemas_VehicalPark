/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Notification;
import dao.NotificationDao;
import java.util.ArrayList;
import java.util.List;
import model.DeleteNotificationRequest;
import model.GetNotificationRequest;
import model.InsertNotificationRequest;
import model.NotificationRespons;
import model.UpdateNotificationRequest;

/**
 *
 * @author Sandeepa Fernando
 */
public class NotificationService {

    public static NotificationDao notiDao = new NotificationDao();

    public static boolean insertNotification(InsertNotificationRequest request) {
        Notification newnoti = new Notification();

        // newnoti.setNot_Id(request.getNot_Id());
        newnoti.setNot_type(request.getNot_type());
        newnoti.setNot_desc(request.getNot_desc());
        newnoti.setUser_Id(request.getUser_Id());

        return notiDao.insertNotification(newnoti);
    }

    public static List<NotificationRespons> getAllNotification() {
        List<Notification> notifiList = notiDao.getAllNotification();
        List<NotificationRespons> responseList = new ArrayList<>();

        for (Notification noti : notifiList) {
            NotificationRespons response = new NotificationRespons();

            response.setNot_Id(noti.getNot_Id());
            response.setNot_type(noti.getNot_type());
            response.setNot_desc(noti.getNot_desc());
            response.setUser_Id(noti.getUser_Id());

            responseList.add(response);
        }

        return responseList;
    }

    public static NotificationRespons getNotification(GetNotificationRequest request) {
        NotificationRespons response = new NotificationRespons();
        int id = request.getNotifi_id();

        Notification user = notiDao.getNotificationById(id);

        response.setNot_Id(user.getNot_Id());
        response.setNot_type(user.getNot_type());
        response.setNot_desc(user.getNot_desc());
        response.setUser_Id(user.getUser_Id());

        return response;
    }

    public static boolean updateNotification(UpdateNotificationRequest request) {
        Notification notifi = new Notification();

        notifi.setNot_type(request.getNot_type());
        notifi.setNot_desc(request.getNot_desc());
        notifi.setNot_Id(request.getNot_Id());

        return notiDao.updateNotification(notifi);
    }

    public static boolean deleteNotification(DeleteNotificationRequest request) {
        int id = request.getNotifi_id();

        return notiDao.deleteNotification(id);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Payment_schema;
import dao.Payment_schemaDao;
import java.util.ArrayList;
import java.util.List;
import model.DeletePayment_schemaRequest;
import model.GetPayment_schemaRequest;
import model.InsertPayment_schemaRequest;
import model.Payment_schemaRespons;
import model.UpdatePayment_schemaRequest;

/**
 *
 * @author Sandeepa Fernando
 */
public class Payment_schemaService {

    public static Payment_schemaDao payDao = new Payment_schemaDao();

    public static boolean insertPayment_schema(InsertPayment_schemaRequest request) {
        Payment_schema newSchema = new Payment_schema();

        newSchema.setPs_name(request.getPs_name());
        newSchema.setPs_rate(request.getPs_rate());
        newSchema.setPs_desc(request.getPs_desc());

        return payDao.insertPayment_schema(newSchema);
    }

    public static List<Payment_schemaRespons> getAllPayment_schema() {
        List<Payment_schema> schemaList = payDao.getAllPayment_schema();
        List<Payment_schemaRespons> responseList = new ArrayList<>();

        for (Payment_schema pay : schemaList) {
            Payment_schemaRespons response = new Payment_schemaRespons();

            response.setPsId(pay.getPsId());
            response.setPs_name(pay.getPs_name());
            response.setPs_rate(pay.getPs_rate());
            response.setPs_desc(pay.getPs_desc());

            responseList.add(response);
        }

        return responseList;
    }

    public static Payment_schemaRespons getPayment_schema(GetPayment_schemaRequest request) {
        Payment_schemaRespons response = new Payment_schemaRespons();
        int id = request.getPsId();

        Payment_schema schema = payDao.getPayment_schemaById(id);

        response.setPsId(schema.getPsId());
        response.setPs_name(schema.getPs_name());
        response.setPs_rate(schema.getPs_rate());
        response.setPs_desc(schema.getPs_desc());

        return response;
    }

    public static boolean updatePayment_schema(UpdatePayment_schemaRequest request) {
        Payment_schema pay = new Payment_schema();

        pay.setPs_name(request.getPs_name());
        pay.setPs_rate(request.getPs_rate());
        pay.setPs_desc(request.getPs_desc());
        pay.setPsId(request.getPsId());

        return payDao.updatePayment_schema(pay);
    }

    public static boolean deletePayment_schema(DeletePayment_schemaRequest request) {
        int id = request.getPsId();

        return payDao.deletePayment_schema(id);
    }
}

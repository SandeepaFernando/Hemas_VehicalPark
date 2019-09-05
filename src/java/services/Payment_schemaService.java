/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Payment_schema;
import dao.Payment_schemaDao;
import model.InsertPayment_schemaRequest;

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
}

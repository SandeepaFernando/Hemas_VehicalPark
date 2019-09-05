/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Sandeepa Fernando
 */
public class Payment_schema {

    int psId;
    String ps_name;
    double ps_rate;
    String ps_desc;

    public Payment_schema() {

    }

    public Payment_schema(int psId, String ps_name, double ps_rate, String ps_desc) {
        this.psId = psId;
        this.ps_name = ps_name;
        this.ps_rate = ps_rate;
        this.ps_desc = ps_desc;
    }

    public int getPsId() {
        return psId;
    }

    public void setPsId(int psId) {
        this.psId = psId;
    }

    public String getPs_name() {
        return ps_name;
    }

    public void setPs_name(String ps_name) {
        this.ps_name = ps_name;
    }

    public double getPs_rate() {
        return ps_rate;
    }

    public void setPs_rate(double ps_rate) {
        this.ps_rate = ps_rate;
    }

    public String getPs_desc() {
        return ps_desc;
    }

    public void setPs_desc(String ps_desc) {
        this.ps_desc = ps_desc;
    }
    
    
}

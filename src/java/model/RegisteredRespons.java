/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.sql.Timestamp;

/**
 *
 * @author Sandeepa Fernando
 */
public class RegisteredRespons {

    int user_Id;
    String RVehicleNo;
    String RNIC;
    Timestamp RArrivedTime;
    Timestamp RLeavedTime;

    public RegisteredRespons(int user_Id, String RVehicleNo, String RNIC, Timestamp RArrivedTime, Timestamp RLeavedTime) {
        this.user_Id = user_Id;
        this.RVehicleNo = RVehicleNo;
        this.RNIC = RNIC;
        this.RArrivedTime = RArrivedTime;
        this.RLeavedTime = RLeavedTime;
    }

    public RegisteredRespons() {

    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getRVehicleNo() {
        return RVehicleNo;
    }

    public void setRVehicleNo(String RVehicleNo) {
        this.RVehicleNo = RVehicleNo;
    }

    public String getRNIC() {
        return RNIC;
    }

    public void setRNIC(String RNIC) {
        this.RNIC = RNIC;
    }

    public Timestamp getRArrivedTime() {
        return RArrivedTime;
    }

    public void setRArrivedTime(Timestamp RArrivedTime) {
        this.RArrivedTime = RArrivedTime;
    }

    public Timestamp getRLeavedTime() {
        return RLeavedTime;
    }

    public void setRLeavedTime(Timestamp RLeavedTime) {
        this.RLeavedTime = RLeavedTime;
    }

}

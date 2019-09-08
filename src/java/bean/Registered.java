/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Sandeepa Fernando
 */
public class Registered {

    int user_Id;
    String RVehicleNo;
    String RNIC;
    Timestamp RArrivedTime;
    Timestamp RLeavedTime;

    public Registered() {

    }

    public Registered(int user_Id, String RVehicleNo, String RNIC, Timestamp RArrivedTime, Timestamp RLeavedTime) {
        this.user_Id = user_Id;
        this.RVehicleNo = RVehicleNo;
        this.RNIC = RNIC;
        this.RArrivedTime = RArrivedTime;
        this.RLeavedTime = RLeavedTime;
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

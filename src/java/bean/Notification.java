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
public class Notification {

    int not_Id;
    String not_type;
    String not_desc;
    int user_Id;

    public Notification(int not_Id, String not_type, String not_desc, int user_Id) {
        this.not_Id = not_Id;
        this.not_type = not_type;
        this.not_desc = not_desc;
        this.user_Id = user_Id;
    }

    public Notification() {

    }

    public int getNot_Id() {
        return not_Id;
    }

    public void setNot_Id(int not_Id) {
        this.not_Id = not_Id;
    }

    public String getNot_type() {
        return not_type;
    }

    public void setNot_type(String not_type) {
        this.not_type = not_type;
    }

    public String getNot_desc() {
        return not_desc;
    }

    public void setNot_desc(String not_desc) {
        this.not_desc = not_desc;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }
    
    

}

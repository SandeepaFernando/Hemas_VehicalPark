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
public class User {

    int id;
    String utype;
    String uemail;
    String uname;
    String uaddress;
    String password;

    public User(int id, String utype, String uemail, String uname, String uaddress, String password) {
        this.utype = utype;
        this.uemail = uemail;
        this.uname = uname;
        this.uaddress = uaddress;
        this.password = password;
        this.id = id;
    }

    public User(String utype, String uemail, String uname, String uaddress, String password) {
        this.utype = utype;
        this.uemail = uemail;
        this.uname = uname;
        this.uaddress = uaddress;
        this.password = password;
    }

    public User() {
        
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
}
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
public class Security {

    int id;
    String utype;
    String uemail;
    String uname;
    String uaddress;
    String password;
    int whrs;

    public Security(int id, String utype, String uname, String uaddress, String password, int whrs) {
        this.id = id;
        this.utype = utype;
        this.uname = uname;
        this.uaddress = uaddress;
        this.password = password;
        this.whrs = whrs;
    }
    
    public Security(){
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getWhrs() {
        return whrs;
    }

    public void setWhrs(int whrs) {
        this.whrs = whrs;
    }
    
    
}

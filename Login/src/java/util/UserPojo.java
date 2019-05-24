/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author BNDG-WINDOW
 */
public class UserPojo {
    protected int id;
    protected String email;
    protected String password;
    protected String name;
    protected String status;

    public int getId() { return id; }

    public String getEmail() { return email; }

    public String getName() { return name; }

    public String getStatus() { return status; }
    
    

    public void setId(int id) { this.id = id; }

    public void setEmail(String email) { this.email = email; }

    public void setPassword(String password) { this.password = password; }

    public void setName(String name) { this.name = name; }

    public void setStatus(String status) { this.status = status; }

    public UserPojo(int id, String email, String password, String name, String status) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.status = status;
    }
}

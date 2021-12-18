/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fac.project;

/**
 *
 * @author a
 */
public class User extends BaseEntity {
    private String authorities;
    private String name;
    private String email;
    private int password;

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getAuthorities() {
        return authorities;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }
    
    
}

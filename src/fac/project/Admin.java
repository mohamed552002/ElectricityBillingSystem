/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fac.project;

/**
 *
 * @author a
 */
public class Admin extends BaseEntity {
    private int phone;
    private String photo;

    public int getPhone() {
        return phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    
}

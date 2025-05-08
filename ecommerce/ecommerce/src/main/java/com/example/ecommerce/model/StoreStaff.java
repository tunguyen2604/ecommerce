package com.example.ecommerce.model;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "storestaff") 
public class StoreStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int employeeid;
    
    String employeename;
    String firstname;
    String lastname;
    String email;
    String phone;
    String gender;
    String position;
    String address;
    Date startdate;
    int workhour;
    int managerid;
    public int getEmployeeid() {
        return employeeid;
    }
    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
    public String getEmployeename() {
        return employeename;
    }
    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getStartdate() {
        return startdate;
    }
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
    public int getWorkhour() {
        return workhour;
    }
    public void setWorkhour(int workhour) {
        this.workhour = workhour;
    }
    public int getManagerid() {
        return managerid;
    }
    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }
    public StoreStaff() {}
    public StoreStaff(int employeeid, String employeename, String firstname, String lastname, String email,
            String phone, String gender, String position, String address, Date startdate, int workhour, int managerid) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.position = position;
        this.address = address;
        this.startdate = startdate;
        this.workhour = workhour;
        this.managerid = managerid;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orphan;

import java.util.Date;

/**
 *
 * @author shlokashah
 */
public class Orphan {
    
    private String name;
    private int age;
    private String country;
    private String gender;
    private Date registrationDate;
    private String status;

    public Orphan() {
        this.name = name;
        this.age = age;
        this.country = country;
        this.gender = gender;
        this.registrationDate = new Date();
        this.status = "Available";
    }

    public Orphan(String name, int age, String country, String gender, String status) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.gender = gender;
        this.registrationDate = new Date();
        this.status = status;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  name;
    } 
}

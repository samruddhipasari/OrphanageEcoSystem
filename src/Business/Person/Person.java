/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author raunak
 */
public class Person {
    
    private String name;
    private int id;
    private static int count = 1;
    private String address;
    private String email;
    private String contact;
    
    

    public Person() {
        id = count;
        count++;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    
    
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }  
}

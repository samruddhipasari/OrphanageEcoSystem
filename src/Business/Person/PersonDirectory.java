/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person createPerson(String name,String address,String email, String contact){
        Person person = new Person();
        person.setName(name);
        person.setAddress(address);
        person.setContact(contact);
        person.setEmail(email);
        personList.add(person);
        return person;
    }
}
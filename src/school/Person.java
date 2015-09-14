/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.ArrayList;

/**
 *
 * @author 149003115
 */
public class Person {
    enum Gender {
        MALE,
        FEMALE,
        OTHER,
    };
    
    private String name;
    private Gender gender;
    private int weight;
    
    public static ArrayList people = new ArrayList();
    
    Person() {
        name = "No Name";
        gender = Gender.OTHER;
        weight = 0;
        
        people.add(this);
    };
    
    Person(String _name) {
        name = _name;
        gender = Gender.OTHER;
        weight = 0;
        
        people.add(this);
    };
    
    Person(String _name, Gender _gender) {
        name = _name;
        gender = _gender;
        weight = 0;
        
        people.add(this);
    };
    
    Person(String _name, Gender _gender, int _weight) {
        name = _name;
        gender = _gender;
        weight = _weight;
        
        people.add(this);
    };
    
    public String getName() {
        return name;
    };
    
    public void setName(String _name) {
        name = _name;
    };
    
    public Gender getGender() {
        return gender;
    };
    
    public void setGender(Gender _gender) {
        gender = _gender;
    };
    
    public int getWeight() {
        return weight;
    };
    
    public void setWeight(int _weight) {
        weight = _weight;
    };
 
    public String toString() {
        return "name: " + name + "\n" +
                "gender: " + gender + "\n" +
                "weight: " + weight;
    }
}

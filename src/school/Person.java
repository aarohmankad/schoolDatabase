/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.ArrayList;
import java.lang.reflect.*;
/**
 *
 * @author 149003115
 */
public class Person {
    enum Gender {
        MALE,
        FEMALE,
    };
    
    private String name;
    private Gender gender;
    
    Person() {
        name = "No Name";
        gender = Gender.MALE;
    };
    
    Person(String _name, Gender _gender) {
        name = _name;
        gender = _gender;
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
}

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
public class Course {
    public enum Type {
        MATH,
        SCIENCE,
        ENGLISH,
        HISTORY,
        LANGUAGE,
        ELECTIVE,
        PE,
    };
    
    private int period;
    private Type type;
    private String courseName;
    
    private static ArrayList<Course> courses = new ArrayList<Course>();
    
    Course() {
        period = 0;
        courseName = "Not Determined";
        
        courses.add(this);
    };
    
    Course(int _period) {
        period = _period;
        courseName = "Not Determined";
        
        courses.add(this);
    };
    
    Course(int _period, Type _type) {
        period = _period;
        type = _type;
        
        courses.add(this);
    };
    
    Course(int _period, Type _type, String _courseName) {
        period = _period;
        type = _type;
        courseName = _courseName;
        
        courses.add(this);
    };
    
    public int getPeriod() {
        return period;
    };
    
    public void setPeriod(int _period) {
        period = _period;
    };
    
    public Type getType() {
        return type;
    };
    
    public void setType(Type _type) {
        type = _type;
    };
    
    public String getCourseName() {
        return courseName;
    };
    
    public void setCourseName(String _courseName) {
        courseName = _courseName;
    };
    
    public static void printAll() {
        System.out.println("\nALL COURSES: \n");
        for(Course course : courses) {
            System.out.println(course);
        }
    };
    
    public String toString() {
        return  "name: " + courseName + "\n" + 
                "period: " + period + "\n" +
                "type: " + type + "\n" +
                "----------------------------";
    };
}

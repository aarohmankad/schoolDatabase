package school;

/**
 * School Database made in Computer Science 2
 * @author 149003115
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person aaroh = new Person("Aaroh", Person.Gender.MALE, 155);
        Person michael = new Person("Michael", Person.Gender.MALE, 130);
        
        Person.printAll();
        
        Course compSci = new Course(2, Course.Type.ELECTIVE, "Computer Science");
        
        Course.printAll();
    }
}
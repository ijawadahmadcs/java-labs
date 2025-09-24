class Student {
    private int regno; 
    private String name;
    static String uni = "CIIT"; 

    // Constructor
    Student(int r, String n) {
        regno = r;
        name = n;
    }


    void display() {
        System.out.println(regno + " " + name + " " + uni);
    }
}

public class TestStaticVariables {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Jawad");
        Student s2 = new Student(222, "Ahmad");

        // The following line demonstrates how to change the static variable 'uni'
        // for all objects of the Student class. It is currently commented out.
        // Student.uni = "CUI";

        s1.display(); // Displays: 111 ali CIIT
        s2.display(); // Displays: 222 kamran CIIT
    }
}
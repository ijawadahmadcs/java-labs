import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " - " + age + " years old");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[2];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name: ");
            String n = sc.nextLine();
            System.out.print("Enter age: ");
            int a = sc.nextInt();
            sc.nextLine(); // consume newline
            students[i] = new Student(n, a);
        }

        for (Student s : students) {
            s.display();
        }
    }
}

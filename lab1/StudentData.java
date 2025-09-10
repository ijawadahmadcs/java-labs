public class StudentData{
    public String name;
    public String id;
    public String department;
    public String course;
    public String grade;

    void Details(String n, String i, String d, String c, String g){
        name = n;
        id = i;
        department = d;
        course = c;
        grade = g;
     }

    void display(){
        System.out.println("Name:"+ name);
        System.out.println("ID:"+ id);
        System.out.println("Department:"+ department);
        System.out.println("Course:"+ course);
        System.out.println("Grade:"+ grade);
     }
    public static void main(String[] args) {
         StudentData sd1 = new StudentData();
         StudentData sd2 = new StudentData();
         StudentData sd3 = new StudentData();
         sd1.name = "Jawad Ahmad";
         sd1.id = "18SW50";
         sd1.department = "Computer Science";
         sd1.course = "OOP";
         sd1.grade = "A+";
         sd1.display();
         sd2.Details("Ahmad", "18BS60", "Software Engineering", "Java", "A");
         sd2.display();
         sd3.Details("Ali", "45BS60", "Software Non-Engineering", "JavaOP", "b");
         sd3.display();
    }
}
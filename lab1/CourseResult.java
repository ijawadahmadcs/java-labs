public class CourseResult {
    public String studentName;
    public String courseName;
    public String grade;

    public void display() {
        System.out.println("Student Name:" + studentName);
        System.out.println("Course Name:" + courseName);
        System.out.println("Grade:" + grade);
    }

    public static void main(String[] args) {
        CourseResult cr1 = new CourseResult();
        cr1.studentName = "Jawad Ahmad";
        cr1.courseName = "OOP";
        cr1.grade = "A+";
        cr1.display();
        CourseResult cr2 = new CourseResult();
        cr2.studentName = "Ahmad";
        cr2.courseName = "Java";
        cr2.grade = "A";
        cr2.display();
    }
}
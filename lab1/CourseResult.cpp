#include <iostream>
#include <string>
using namespace std;
struct CourseResult {
    string studentName;   
    string courseName;
    string grade;
    void display() {
        cout << "Student Name: " << studentName << endl;
        cout << "Course Name: " << courseName << endl;
        cout << "Grade: " << grade << endl;
    }
};

int main() {
    CourseResult cr1; 
    cr1.studentName = "Jawad Ahmad";
    cr1.courseName = "OOP";
    cr1.grade = "A+";
    cr1.display();
    cr2.studentName = "Ahmad";
    cr2.courseName = "JAVA";
    cr2.grade = "A";
    cr2.display();
}
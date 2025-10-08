class Employee {
    String name;
    Employee(String n) { name = n; }
}

public class Example4 {
    static Employee[] getEmployees() {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Ali");
        employees[1] = new Employee("Sara");
        return employees;  // returning object array
    }

    public static void main(String[] args) {
        Employee[] empList = getEmployees();
        for (Employee e : empList) {
            System.out.println("Employee: " + e.name);
        }
    }
}

import java.util.Scanner;

class Employee {
    private String employeeCode;
    private String employeeName;
    private int joiningYear; 

    public void setEmployeeData(String code, String name, int year) {
        employeeCode = code;
        employeeName = name;
        joiningYear = year;
    }
    
    public void checkTenure(int currentYear) {
        int tenure = currentYear - joiningYear;
        System.out.println("\nEmployee: " + employeeName + " (" + employeeCode + ")");
        if (tenure > 3) {
            System.out.println("Tenure: " + tenure + " years => More than 3 years");
        } else {
            System.out.println("Tenure: " + tenure + " years => Less than or equal to 3 years");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();

        System.out.print("Enter Employee Code: ");
        String code = sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Year of Joining: ");
        int year = sc.nextInt();
        System.out.print("Enter Current Year: ");
        int currentYear = sc.nextInt();

        emp1.setEmployeeData(code, name, year);
        emp1.checkTenure(currentYear);

        sc.close();
    }
}

class EmployeeRunner {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmployeeData("E101", "Jawad Ahmad", 2019);

        Employee emp2 = new Employee();
        emp2.setEmployeeData("E102", "Ali Khan", 2022);

        emp1.checkTenure(2025);
        emp2.checkTenure(2025);
    }
}
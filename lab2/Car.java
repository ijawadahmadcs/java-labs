import java.util.Scanner;

class Car {
    private String carModel;
    private String carName;
    private double carPrice;
    private String carOwner;

    public void setCarData(String model, String name, double price, String owner) {
        carModel = model;
        carName = name;
        carPrice = price;
        carOwner = owner;
    }

    public void display() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Price: " + carPrice);
        System.out.println("Car Owner: " + carOwner);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();

        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Car Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Car Price: ");
        double price = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter Car Owner: ");
        String owner = sc.nextLine();

        c1.setCarData(model, name, price, owner);
        System.out.println("\nCar Details:");
        c1.display();

        sc.close();
//part b-------------------

System.out.println("\n part b -------------:");
        Car car2 = new Car();
        car2.setCarData("2023", "Honda Civic", 4500000, "Ali Khan");

        Car car3 = new Car();
        car3.setCarData("2022", "Suzuki Alto", 2500000, "Ahmed Raza");

        System.out.println("All Car Details:");
        car2.display();
        car3.display();
    }
}
class Car {
    String brand;
    int year;

    Car(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println(brand + " (" + year + ")");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];  // array of 3 Car objects

        cars[0] = new Car("Honda", 2020);
        cars[1] = new Car("Toyota", 2021);
        cars[2] = new Car("Suzuki", 2019);

        for (Car c : cars) {
            c.display();
        }
    }
}

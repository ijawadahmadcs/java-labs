class Circle {
    double radius;

    // No-argument constructor
    Circle() {
        radius = 1.0;   // default radius
    }

    // Two-argument constructor
    Circle(double r) {
        radius = r;
    }

    // Method to calculate circumference
    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius: " + radius + ", Circumference: " + getCircumference());
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();         // default
        Circle c2 = new Circle(5.0);      // user-defined

        c1.display();
        c2.display();
    }
}

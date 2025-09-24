class Distance {
    int feet;
    int inches;

    // No-argument constructor
    Distance() {
        feet = 10;
        inches = 4;
    }

    // Two-argument constructor
    Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    void display() {
        System.out.println("Feet: " + feet + ", Inches: " + inches);
    }
}

public class DistanceMain {
    public static void main(String[] args) {
        Distance d1 = new Distance();        // default
        Distance d2 = new Distance(5, 8);    // user-defined

        d1.display();
        d2.display();
    }
}

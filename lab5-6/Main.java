class Distance {
    private int feet;
    private int inches;

    // 1. No-argument constructor
    Distance() {
        feet = 0;
        inches = 0;
    }

    // 2. Two-argument constructor
    Distance(int f, int i) {
        feet = f;
        inches = i;
        normalize(); // ensure inches < 12
    }

    // Setter methods
    public void setFeet(int f) {
        feet = f;
    }

    public void setInches(int i) {
        inches = i;
        normalize();
    }

    // Getter methods
    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    // Display method
    public void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }

    // Normalize inches (convert 12 inches into 1 foot)
    private void normalize() {
        if (inches >= 12) {
            feet += inches / 12;
            inches = inches % 12;
        }
    }

    // Add two Distance objects and return a new Distance
    public static Distance add(Distance d1, Distance d2) {
        int totalFeet = d1.feet + d2.feet;
        int totalInches = d1.inches + d2.inches;
        return new Distance(totalFeet, totalInches); // auto-normalized
    }
}

public class Main {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8);  // 5 ft 8 in
        Distance d2 = new Distance(3, 10); // 3 ft 10 in

        System.out.print("Distance 1: ");
        d1.display();

        System.out.print("Distance 2: ");
        d2.display();

        Distance sum = Distance.add(d1, d2);
        System.out.print("Sum of distances: ");
        sum.display();
    }
}

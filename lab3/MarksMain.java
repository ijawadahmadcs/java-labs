class Marks {
    int mark1;
    int mark2;
    int mark3;

    // No-argument constructor
    Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    // Parameterized constructor
    Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    // Method to calculate sum
    int calculateSum() {
        return mark1 + mark2 + mark3;
    }
}

public class MarksMain {
    public static void main(String[] args) {
        Marks s1 = new Marks();              // default (0,0,0)
        Marks s2 = new Marks(85, 90, 80);    // custom marks

        System.out.println("Sum of s1 marks = " + s1.calculateSum());
        System.out.println("Sum of s2 marks = " + s2.calculateSum());
    }
}

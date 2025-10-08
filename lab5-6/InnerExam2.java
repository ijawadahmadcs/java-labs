class Outer {
    static String msg = "Static Message";

    static class Inner {
        void display() {
            System.out.println("Static Inner Class: " + msg);
        }
    }
}

public class InnerExam2 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner(); // no need of outer object
        inner.display();
    }
}

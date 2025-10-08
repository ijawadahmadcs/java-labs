class Outer {
    void outerMethod() {
        System.out.println("Inside outerMethod");

        class Inner {
            void innerMethod() {
                System.out.println("Method Local Inner Class");
            }
        }

        Inner inner = new Inner();
        inner.innerMethod();
    }
}

public class InnerExam3 {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.outerMethod();
    }
}

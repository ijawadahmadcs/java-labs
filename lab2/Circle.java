public class Circle {
    static int radius;  

    public static void setRadius(int r) {
        radius = r;
    }

    public static void showCircumference() {
        double c = 2 * 3.14 * radius;
        System.out.println("Circumference is " + c);
    }

    public static void main(String[] args) {
        setRadius(5);
        showCircumference();   

        setRadius(10);
        showCircumference();  
    }
}

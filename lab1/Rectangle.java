public class Rectangle{
    public int length;
    public int width;
    
     void setDimensions(int l, int w) {
        length = l;
        width = w;
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }
    void display() {
       System.out.println("length: "+ length);
       System.out.println("width: "+ width);
       System.out.println("Area: " + getArea());
       System.out.println("Perimeter: " + getPerimeter());
       System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setDimensions(5, 19);
        r1.display();
        Rectangle r2 = new Rectangle();
        r2.setDimensions(19, 12);
        r2.display();
    }
}
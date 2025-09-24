public class Circle{
    private int radius;
    public Circle(){
        radius=7;
    }
    public Circle(int r){
        radius = r;
    }
    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void display(){
        System.out.println("Radius is "+radius);
    }
    public double CalculateCircumference(){
        double a = 2 * 3.14 * radius;
        return a;
    }
}
class Runner
{
public static void main(String[] args) {
 Circle C1 = new Circle();
 C1.setRadius(9);
 System.out.println("Circumference of circle 1 " + C1.CalculateCircumference());
 int r = C1.getRadius();

 Circle C2 = new Circle();
 C2.setRadius(6);
 System.out.println("Circumference of circle 2"+ C2.CalculateCircumference());
}   
}
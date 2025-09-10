public class Car{
    public String brand;
    public String model;
    public String color;
    public int speed;

    void setSpeed(int s){
        speed = s;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Speed: "+speed+" km/h");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Corolla";
        c1.color = "White";
        c1.setSpeed(120);
        c1.display();
        Car c2 = new Car();
        c2.brand = "Honda";
        c2.model = "Civic";
        c2.color = "Black";
        c2.setSpeed(130);
        c2.display();
    }
}
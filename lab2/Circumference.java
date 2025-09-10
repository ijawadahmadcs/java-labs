public class Circumference {
    int radius;
    public void setRadius(int r){
        radius =r;
    }
    public void showCircumference(){
        double c = 2*3.14*radius;
        System.out.println("circumference:"+c);
    }

    public static void main(String[] args) {
        Circumference C1 = new Circumference();
        C1.setRadius(10);
        C1.showCircumference();
        Circumference C2 =  new Circumference();
        C2.setRadius(12);
        C2.showCircumference();
    }
}
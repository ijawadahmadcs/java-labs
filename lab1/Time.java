public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public void setTime(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }

    public void display() {
       System.out.println("Time: "+hours + ":" + minutes + ":" + seconds);
    }
    
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.setTime(10, 20, 30);
        t1.display();
        Time t2 = new Time();
        t2.setTime(5, 15, 45);
        t2.display();
    }
}
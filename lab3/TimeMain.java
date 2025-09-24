class Time {
    int hours;
    int minutes;
    int seconds;

    // No-argument constructor
    Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    // Parameterized constructor
    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    // Display function
    void display() {
        System.out.println(hours + " hr : " + minutes + " min : " + seconds + " sec");
    }
}

public class TimeMain {
    public static void main(String[] args) {
        Time t1 = new Time();           // default 0:0:0
        Time t2 = new Time(12, 45, 30); // custom time

        t1.display();
        t2.display();
    }
}

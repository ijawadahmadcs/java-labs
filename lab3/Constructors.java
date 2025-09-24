class AccessConstructors {

    public AccessConstructors() {
        System.out.println("Public Constructor");    //public Constructor just print message
    }

    private AccessConstructors(int x) { 
        System.out.println("Private Constructor: " + x); //private Constructoronly accept int value
    }

    protected AccessConstructors(String s) {
        System.out.println("Protected Constructor: " + s);  //protected only string is accepted
    }

    AccessConstructors(double d) {
        System.out.println("Default Constructor: " + d);  //default only float is accepted
    }

    public static AccessConstructors createPrivate() {
        return new AccessConstructors(100); // private accessible here
    }
}

public class Constructors {   //publc main class
    public static void main(String[] args) {
        
        new AccessConstructors();       // public
        new AccessConstructors("Hi");   // protected
        new AccessConstructors(12.5);   // default

        AccessConstructors.createPrivate(); // calls private internally
    }
}

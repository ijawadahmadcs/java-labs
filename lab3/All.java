class Example {
    public int pubVal = 1;      //publc variable
    private int priVal = 2;    //private variable
    protected int proVal = 3;   //protected variable
    int defVal = 4;   //default variable

    public void show() {
        System.out.println("Private: " + priVal); // internal public access to private variable 
    }
}

public class All {
    public static void main(String[] args) {  //main class


        Example ex = new Example();  // abj for example class

        System.out.println("Public: " + ex.pubVal);
        // System.out.println(ex.priVal); // error
        System.out.println("Protected: " + ex.proVal);
        System.out.println("Default: " + ex.defVal);

        ex.show(); // private shown internally
    }
}

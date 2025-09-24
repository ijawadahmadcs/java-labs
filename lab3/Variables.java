class AccessVars {
    public int pubVar = 10;  //public
    private int priVar = 20;  //private
    protected int proVar = 30;  //protected
    int defVar = 40; // default

    public void show() {   //public method to access
        System.out.println("Public: " + pubVar);
        System.out.println("Private: " + priVar);
        System.out.println("Protected: " + proVar);
        System.out.println("Default: " + defVar);
    }
}

public class Variables {  //main class
    public static void main(String[] args) {

        AccessVars obj = new AccessVars();

        System.out.println("Public: " + obj.pubVar);
        // System.out.println(obj.priVar); // Error: private
        System.out.println("Protected: " + obj.proVar);
        System.out.println("Default: " + obj.defVar);

        obj.show(); // private shown internally
    }
}
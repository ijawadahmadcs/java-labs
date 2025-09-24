class Parent {    //parent class
    public String pubMsg = "Public";
    private String priMsg = "Private";
    protected String proMsg = "Protected";
    String defMsg = "Default";

    public void showParent() {
        System.out.println("Parent Private: " + priMsg);
    }
}

class Child extends Parent {   //child subclass
    public void showChild() {

        System.out.println(pubMsg);   // public
        // System.out.println(priMsg); // private not accessible
        System.out.println(proMsg);   // protected
        System.out.println(defMsg);   // default (same package)
    }
}

public class ParentChild {   //main class
    public static void main(String[] args) {
        Child c = new Child();   //obj for child class
        c.showParent();  //call for parent class method
        c.showChild();   //call for child classs method
    }
}

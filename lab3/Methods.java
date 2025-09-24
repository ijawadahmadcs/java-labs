class AccessMethods {
    public void pubMethod() { 
        System.out.println("Public Method"); 
        }  //public method
    private void priMethod() { 
        System.out.println("Private Method"); 
        }  //private method
    protected void proMethod() { 
        System.out.println("Protected Method");
        }  //protected method
    void defMethod() { 
        System.out.println("Default Method"); 
        }  //default method

    public void callAll() {
        priMethod(); // can call private inside class because we can't access it outside
    }
}

public class Methods {
    public static void main(String[] args) {   //main class call
        AccessMethods obj = new AccessMethods();

        obj.pubMethod();
        // obj.priMethod(); Error beacuse private access nhi hota outside class
        obj.proMethod();
        obj.defMethod();
        obj.callAll(); // calls private internally
    }
}
import java.util.Scanner;

class carPart{
    private String modelNumber;
    private String partName;
    private String cost;

    public void setParameters(String model, String part, String price){
        modelNumber=model;
        partName=part;
        cost=price;
    }
    public void display(){
        System.out.println("Model Number: "+modelNumber);
        System.out.println("Part Name: "+partName);
        System.out.println("Price: "+cost);
    }
}

public class CarPartRunner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        carPart cp1 = new carPart();
        System.out.println("Enter Model Number:");
        String model = sc.nextLine();
        System.out.println("Enter Part Name:");
        String part = sc.nextLine();
        System.out.println("Enter Price:");
        String price = sc.nextLine();
        cp1.setParameters(model, part, price);
        cp1.display();
        sc.close();
    }
}

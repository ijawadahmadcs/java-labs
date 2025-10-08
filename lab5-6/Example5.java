class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }
}

public class Example5 {
    public static void main(String[] args) {
        Product[][] store = new Product[2][2];

        store[0][0] = new Product("Milk", 2.5);
        store[0][1] = new Product("Bread", 1.5);
        store[1][0] = new Product("Eggs", 3.0);
        store[1][1] = new Product("Butter", 4.2);

        for (int i = 0; i < store.length; i++) {
            for (int j = 0; j < store[i].length; j++) {
                System.out.println("Product: " + store[i][j].name + " - $" + store[i][j].price);
            }
        }
    }
}

public class HotDogStand {

    // Step 1: Private instance variables (Encapsulation)
    private int standID;        // Unique ID for each stand
    private int hotDogsSold;    // Number of hot dogs sold

    // Step 2: Constructor to initialize stand ID and initial sales
    public HotDogStand(int standID, int initialSales) {
        this.standID = standID;
        this.hotDogsSold = initialSales;
    }

    // Step 3: Method to increment sales by one (Encapsulation)
    public void justSold() {
        hotDogsSold++;
    }

    // Step 4: Getter method to access total hot dogs sold
    public int getHotDogsSold() {
        return hotDogsSold;
    }

    // Optional: Getter for stand ID
    public int getStandID() {
        return standID;
    }

    // Step 5: Main method (Test Application)
    public static void main(String[] args) {

        System.out.println("=== HOT DOG STAND SALES TRACKER ===\n");

        // Create 3 different HotDogStand objects
        HotDogStand stand1 = new HotDogStand(1, 5);
        HotDogStand stand2 = new HotDogStand(2, 2);
        HotDogStand stand3 = new HotDogStand(3, 0);

        // Simulate sales using justSold() method
        stand1.justSold();
        stand1.justSold();
        stand2.justSold();
        stand3.justSold();
        stand3.justSold();
        stand3.justSold();

        // Display final sales for each stand
        System.out.println("Final Sales Report:");
        System.out.println("Stand " + stand1.getStandID() + ": " + stand1.getHotDogsSold() + " hot dogs sold.");
        System.out.println("Stand " + stand2.getStandID() + ": " + stand2.getHotDogsSold() + " hot dogs sold.");
        System.out.println("Stand " + stand3.getStandID() + ": " + stand3.getHotDogsSold() + " hot dogs sold.");

        // Calculate total sales
        int totalSales = stand1.getHotDogsSold() + stand2.getHotDogsSold() + stand3.getHotDogsSold();
        System.out.println("\nTotal Hot Dogs Sold Across All Stands: " + totalSales);
    }
}

import java.util.ArrayList;


public class Order {

    // Member Variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();


    // Guest Order(no name given)
    public Order() {
        this.name="Guest";
        this.ready = false;
    }

    // Order
    public Order(String name) {
        this.name = name;
        this.ready = false;
    }

    // ----- SETTERS -----

    // Set Name
    public void setName(String name) {
        this.name = name;
    }

    // Set Items
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // Set Ready
    public void setReady(boolean ready) {
        this.ready = ready;
    }


    // ----- GETTERS -----

    // Get Name
    public String getName() {
        return this.name;
    }

    // Get Ready
    public boolean getReady() {
        return this.ready;
    }

    // Get Items
    public ArrayList<Item> getItems() {
        return this.items;
    }


    // ----- Add Items -----
    public void addItem(Item item) {
        this.items.add(item);
    }

    // ----- Get Total -----
    public double getOrderTotal() {

        // Create Total to add to
        double total = 0.00;

        // Create a for loop to add the price of each item to the total
        for(Item item:this.items) {
            // Use the getPrice method to get the price of the item
            total += item.getPrice();
        }
        return total;
    }

    // Get Order Status
    public String getStatusMessage(){

        // Check if the order is ready
        if(this.ready == true) {
            return ("Your order is ready!!!");
        } else {
            return ("Your order will be ready shortly.");
        }
    }

    // Display Order
    public void display() {

        // Display the name of the order
        System.out.printf("\n\nCustomer Name: %s", this.name);

        // Create a for loop to iterate through the list of items
        for(Item item:this.items) {
            System.out.printf("\n%s - $%s",item.getName(),item.getPrice());
        }

        // Display order total
        System.out.printf("\nTotal: $%s\n\n", this.getOrderTotal());
    }

}
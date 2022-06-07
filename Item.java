public class Item {

    // Member Variables
    private String name;
    private double price;

    // ----- Item ----
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // ----- SETTERS -----

    // Set Name
    public void setName(String name) {
        this.name = name;
    }

    // Set Price
    public void setPrice(double price) {
        this.price = price;
    }


    // ----- GETTERS -----

    // Get Name
    public String getName() {
        return this.name;
    }

    // Get Price
    public double getPrice() {
        return this.price;
    }


}
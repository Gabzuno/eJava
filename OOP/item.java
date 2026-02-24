package OOP;

// Encapsulation
public abstract class item {
    // Attributes
    private String name;
    private int quantity;

    // Constructor
    public item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    // Methods
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract void displayInfo();
}

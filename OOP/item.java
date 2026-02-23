package OOP;

// Encapsulation
public class item {
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

    @Override
    public String toString(){
        return "Item: " + name + ", Quantity: " + quantity;
    }
}

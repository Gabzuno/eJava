package OOP;

// Inheritance
public class fruit implements itemStuff{
    private String Type;
    private String name;
    private int quantity;

    public fruit(String name, int quantity, String type) {
        this.Type = type;
        this.name = name;
        this.quantity = quantity;
    }

    public String getType(){
        return Type;
    }

    // Methods
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + Type);
    }
}

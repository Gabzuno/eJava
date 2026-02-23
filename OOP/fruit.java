package OOP;

// Inheritance
public class fruit extends item{
    private String Type;

    public fruit(String name, int quantity, String type) {
        super(name, quantity);
        this.Type = type;
    }

    public String getType(){
        return Type;
    }

    @Override
    public String toString(){
        return "Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + Type;
    }
}

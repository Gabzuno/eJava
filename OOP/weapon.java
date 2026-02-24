package OOP;

public class weapon extends item {
    private int damage;
    private String type;

    public weapon(String name, int quantity, int damage, String type){
        super(name, quantity);
        this.damage = damage;
        this.type = type;
    }

    public int getDamage(){
        return damage;
    }

    public String getType(){
        return type;
    }

    // public String displayInfo() - for console logging, UI, System.out.println, etc.
    // public void displayInfo() - for more complex display logic, UI rendering, etc.
    @Override
    public void displayInfo(){
        System.out.println("Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + damage + ", Type: " + type);
    }
}

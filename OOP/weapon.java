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

    @Override
    public String toString(){
        return "Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + damage + ", Type: " + type;
    }
}

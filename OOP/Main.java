package OOP;

public class Main {
    public static void main(String[] args) {
        inventory Inventory = new inventory();

        item newItem = new item("Generic Item",10);
        fruit newFruit = new fruit("Apple", 10, "Fuji");
        weapon newWeapon = new weapon("Sword", 1, 100, "Melee");

        Inventory.addItem(newItem);
        Inventory.addItem(newFruit);
        Inventory.addItem(newWeapon);

        Inventory.displayInventory();
    }
}

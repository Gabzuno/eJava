package OOP;

import java.util.ArrayList;

public class inventory {
    // ArrayList can store objects of the item class
    private ArrayList<item> items;

    public inventory() {
        items = new ArrayList<>();
    }  

    public void addItem(item newItem) {
        items.add(newItem);
    }

    // Method Overloading - Compile Time Polymorphism
    public void addItem(String name, int quantity, String type) {
        items.add(new fruit(name, quantity, type));
    }

    public void addItem(String name, int quantity, int damage, String type) {
        items.add(new weapon(name, quantity, damage, type));
    }

    // Dynaic Polymorphism - Runtime Polymorphism
    public void displayInventory(){
        for(item item : items){
            item.displayInfo();
        }
    }

    // Overloading - Compile Time Polymorphism
    public void displayInventory(String filterType){
        for(item item : items){
            if(item instanceof fruit && ((fruit) item).getType().equalsIgnoreCase(filterType)){
                System.out.println(item.toString());
            }
            else if(item instanceof weapon && ((weapon) item).getType().equalsIgnoreCase(filterType)){
                System.out.println(item.toString());
            }
        }
    }
}

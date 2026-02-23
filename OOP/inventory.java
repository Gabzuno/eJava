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

    // Dynaic Polymorphism - Runtime Polymorphism
    public void displayInventory(){
        for(item item : items){
            System.out.println(item.toString());
        }
    }
}

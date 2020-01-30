package ca.ubc.cpsc210.grocery.model;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

// Represents a grocery bill having a list of line items
public class GroceryBill {

    public List<GroceryItem> groceryList;
    public List<LineItem> lineList;
    public int totalQuantity;
    public int amountPurchased;
    public int lineQuantity;
    public String str = "";


    // EFFECTS: constructs an empty grocery bill
    public GroceryBill() {
        groceryList = new ArrayList<>();
        lineList = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: adds a purchase to the grocery bill where item is the grocery item purchased
    // and quantity is the quantity of that item purchased; if item has previously been added
    // to this bill, quantity of item purchased is increased on previous entry, rather than
    // adding a new entry
    public void addPurchase(GroceryItem item, int quantity) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
            lineList.add(new LineItem(item, quantity));
            lineQuantity++;
        } else {
            for (LineItem l : lineList) {
                if (l.getGroceryItem() == item) {
                    l.addQuantity(quantity);
                }
            }
        }
    }

    // EFFECTS: returns total number of items purchased
    public int getTotalNumberOfItemsPurchased() {
        for (LineItem l : lineList) {
            amountPurchased = amountPurchased + l.getQuantity();
        }
        return amountPurchased;
    }

    // EFFECTS: returns number of line items on this bill
    public int getNumLineItems() {
        return lineQuantity;
    }

    // EFFECTS: returns total quantity of item purchased on this bill;
    // returns 0 if the item has not been added to bill
    public int getTotalQuantityOfItemPurchased(GroceryItem item) {
        for (LineItem l : lineList) {
            if (l.getGroceryItem() == item) {
                totalQuantity = l.getQuantity();
            }
        }
        return totalQuantity;
    }

    // EFFECTS: returns a string representing this bill where each
    // line item is recorded on a line of its own in the format
    // (quantity)x (item)
    // For example:
    // 2x cheesies @ $1.49
    // 4x red bull @ @2.99
    // 1x macaroni cheese @ $3.55
    public String toString() {

        for (LineItem l : lineList) {
            str += "\n" + l.getQuantity() + "x " + l.getGroceryItem().getDescription()
                    + " @ $" + l.getGroceryItem().getPrice() / 100.00;
        }
        return str;
    }
}

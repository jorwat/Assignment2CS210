package ca.ubc.cpsc210.grocery.model;

// Represents a grocery bill having a list of line items
public class GroceryBill {

    // EFFECTS: constructs an empty grocery bill
    public GroceryBill() {
        // stub
    }

    // MODIFIES: this
    // EFFECTS: adds a purchase to the grocery bill where item is the grocery item purchased
    // and quantity is the quantity of that item purchased; if item has previously been added
    // to this bill, quantity of item purchased is increased on previous entry, rather than
    // adding a new entry
    public void addPurchase(GroceryItem item, int quantity) {
        // stub
    }

    // EFFECTS: returns total number of items purchased
    public int getTotalNumberOfItemsPurchased() {
        return 0;   // stub
    }

    // EFFECTS: returns number of line items on this bill
    public int getNumLineItems() {
        return 0;   // stub
    }

    // EFFECTS: returns total quantity of item purchased on this bill;
    // returns 0 if the item has not been added to bill
    public int getTotalQuantityOfItemPurchased(GroceryItem item) {
        return 0;   // stub
    }

    // EFFECTS: returns a string representing this bill where each
    // line item is recorded on a line of its own in the format
    // (quantity)x (item)
    // For example:
    // 2x cheesies @ $1.49
    // 4x red bull @ @2.99
    // 1x macaroni cheese @ $3.55
    public String toString() {
        return null;    // stub
    }
}

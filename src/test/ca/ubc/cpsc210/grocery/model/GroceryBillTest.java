package ca.ubc.cpsc210.grocery.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Unit tests for the GroceryBill class
class GroceryBillTest {
    GroceryBill b1;
    GroceryItem milk;
    GroceryItem cereal;
    GroceryItem tea;

    @BeforeEach
    void runBefore(){
        b1 = new GroceryBill();
        milk = new GroceryItem("Milk",299);
        cereal = new GroceryItem("Cereal", 359);
        tea = new GroceryItem("Tea", 875);
    }

    @Test
    void testAddPurchase(){
        b1.addPurchase(cereal,2);
        assertEquals(2, b1.getTotalNumberOfItemsPurchased());
        assertEquals(1, b1.getNumLineItems());
        assertEquals(2, b1.getTotalQuantityOfItemPurchased(cereal));

    }

    @Test
    void testTotalNumberOfItemsPurchased(){
        b1.addPurchase(cereal,3);
        b1.addPurchase(milk, 1);
        b1.addPurchase(tea, 2);
        assertEquals(6,b1.getTotalNumberOfItemsPurchased());
    }

    @Test
    void testGetNumLineItems(){
        b1.addPurchase(cereal,3);
        b1.addPurchase(milk, 1);
        b1.addPurchase(tea, 2);
        assertEquals(3,b1.getNumLineItems());
    }

    @Test
    void testGetTotalQuantityOfItemPurchased(){
        b1.addPurchase(cereal,1);
        b1.addPurchase(milk, 1);
        b1.addPurchase(tea, 1);
        assertEquals(1,b1.getTotalQuantityOfItemPurchased(milk));
    }

    @Test
    void testToString() {
        b1.addPurchase(cereal, 1);
        b1.addPurchase(milk, 1);
        b1.addPurchase(tea, 1);
        assertEquals(
                "\n1x Cereal @ $3.59" +
                "\n1x Milk @ $2.99" +
                "\n1x Tea @ $8.75", b1.toString());
    }
    }


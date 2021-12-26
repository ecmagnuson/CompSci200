package zyLabsChapter9;
///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Learning java array lists. removing, adding, swapping
// Course:          CS 200
//
// Author:          Elliott Magnuson
// Email:           ecmagnuson@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//None were used.
//
//
//
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          course number, term, and year
//
// Author:          your name
// Email:           your @wisc.edu email address
// Lecturer's Name: name of your lecturer
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples:
// Jane Doe; helped me with for loop in reverse method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html; 
//         counting for loop
// John Doe; I helped with switch statement in main method.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    /**
     * test for calculatePayment()
     * 
     * @param items
     * @param price
     * @param quantity
     */
    public static void testCalculatePayment(ArrayList<String> name, ArrayList<Integer> price,
            ArrayList<Integer> quantity) {
        boolean error = false;
        int payment = calculatePayment(name, price, quantity);
        if (payment != 32) {
            error = true;
            System.out.println("Expected payment : " + 32);
            System.out.println("Actual payment : " + payment);
        }
        if (error) {
            System.out.println("testCalculatePayment fail");
        } else {
            System.out.println("testCalculatePayment pass");

        }
    }

    /**
     * test for deleteItemFromShoppingList()
     */
    public static void testDeleteItemFromShoppingList(String item_name, ArrayList<String> name,
            ArrayList<Integer> price, ArrayList<Integer> quantity) {

    }

    /**
     * test for updateShoppingList()
     */
    public static void testUpdateShoppingList(String item_name, int item_price, int item_quantity,
            ArrayList<String> name, ArrayList<Integer> price, ArrayList<Integer> quantity) {

    }

    /**
     * This method will take ArrayLists representing the shopping list and calculate
     * how much you need to pay.
     * 
     * @param name     Item names in your shopping cart
     * @param price    The price for each item in ArrayList name
     * @param quantity How many items bought.
     * 
     * @return integer that has the payment, or -1 if any parameter is null.
     */
    public static int calculatePayment(ArrayList<String> name, ArrayList<Integer> price, ArrayList<Integer> quantity) {

        if (name == null || price == null || quantity == null) {
            return -1;
        }

        int totalPrice = 0;

        for (int i = 0; i < name.size(); i++) {
            totalPrice = totalPrice + (price.get(i) * quantity.get(i));
        }

        return totalPrice;
    }

    /**
     * This method will delete the item_name and corresponding price, quantity from
     * the ArrayLists. If any Arraylist parameters are null it returns without
     * changes.
     * 
     * @param item_name name of the item
     * @param name      Item names in your shopping cart
     * @param price     The price for each item in ArrayList name
     * @param quantity  How many items bought.
     */

    /**
     * This method will update the quantity for a given item_name and item_price. If
     * any ArrayList parameter is null this will return without changes.
     * 
     * @param item_name     name of the item
     * @param item_price    price of the item
     * @param item_quantity quantity of the item
     * @param name          Item names in your shopping cart
     * @param price         The price for each item in ArrayList name
     * @param quantity      How many items bought.
     */
    public static void updateShoppingList(String item_name, int item_price, int item_quantity, ArrayList<String> name,
            ArrayList<Integer> price, ArrayList<Integer> quantity) {

        if (name == null || price == null || quantity == null) {
            return;
        }

        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).equals(item_name)) {

                name.set(i, item_name);
                price.set(i, item_price);
                quantity.set(i, item_quantity);
            }
        }
    }

    public static void deleteItemFromShoppingList(String item_name, ArrayList<String> name, ArrayList<Integer> price,
            ArrayList<Integer> quantity) {

        if (name == null || price == null || quantity == null) {
            return;
        }
        /*
         * name.remove(item_name);
        price.remove(item_name);
        quantity.remove(item_name);
         */
       for (int i = 0; i < name.size(); i++) {
           if (name.get(i).equals(item_name)) {
               name.remove(i);
               price.remove(i);
               quantity.remove(i);
           }
       }
    }

    public static void main(String[] args) {
        ArrayList<String> item = new ArrayList<>(Arrays.asList("oreo", "ice-cream", "oatmeal"));
        ArrayList<Integer> price = new ArrayList<>(Arrays.asList(3, 5, 7));
        ArrayList<Integer> quantity = new ArrayList<>(Arrays.asList(2, 1, 3));
        // testCalculatePayment(item, price, quantity);
        // testDeleteItemFromShoppingList(item_name, item, price, quantity);
        // testUpdateShoppingList(item_name, item_price, item_quantity, item, price,
        // quantity);
        
        deleteItemFromShoppingList("oatmeal", item, price, quantity);
        
        for (int i = 0; i < quantity.size(); i++) {
            System.out.println(quantity.get(i));
        }
    }
}

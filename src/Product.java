/*
 * Date: April 22, 2022
 * Author: Farhaan Ali
 * Description: Parent class for category classes; contains fundemental properties of each product
 */

import java.text.DecimalFormat;

public class Product {
    DecimalFormat format = new DecimalFormat("$#,###0.00"); // Will apply currency formatting when displaying the product price
    private String name;
    private int quantity;
    private double price;
    
    // Constructors
    public Product() {
        name = "";
        quantity = 0;
        price = 0;
    }
    
    public Product(String inName, int inQuantity, double inPrice) {
        name = inName;
        quantity = inQuantity;
        price = inPrice;
    }
    
    // Accessor methods
    public String getName() {
        return name;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Modifier methods
    public void setName(String inName) {
        name = inName;
    }
    
    public void setQuantity(int inQuantity) {
        quantity = inQuantity;
    }
    
    public void setPrice(double inPrice) {
        price = inPrice;
    }
    
    // toString() method
    public String toString() {
        return quantity + "x " + name + ": " + format.format(price);
    }
}
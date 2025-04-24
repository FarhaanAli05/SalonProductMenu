/*
*  Date: April 22, 2022
*  Author: Farhaan Ali
*  Description: This is the client code for the 'Product' class and its various subclasses
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductClient  {

    public static void main(String[] args) {
        // Declaration of scanner and 'products' 2D array
        Scanner scanner = new Scanner(System.in);
        Product[][] products = new Product[5][];
        
        // Allocation of space for each product category
        products[0] = new ShampooAndConditioner[2];
        products[1] = new Disinfectant[4];
        products[2] = new Brush[6];
        products[3] = new HairstylingProduct[22];
        products[4] = new OtherUtensil[16];
        
        // Initialization of 'ShampooAndConditioner' subarray
        products[0][0] = new ShampooAndConditioner("Shampoo", 4, 60);
        products[0][1] = new ShampooAndConditioner("Conditioner", 4, 60);
        
        // Initialization of 'Disinfectant' subarray
        products[1][0] = new Disinfectant("Barbicide", 2, 30);
        products[1][1] = new Disinfectant("Bleach", 2, 40);
        products[1][2] = new Disinfectant("Disinfectant Spray", 2, 30);
        products[1][3] = new Disinfectant("Disinfectant Jars", 3, 75);
        
        // Initialization of 'Brush' subarray
        products[2][0] = new Brush("Round Brush", 3, 45);
        products[2][1] = new Brush("Application Brush", 2, 40);
        products[2][2] = new Brush("Finishing Brush", 2, 30);
        products[2][3] = new Brush("Paddle Brush", 3, 75);
        products[2][4] = new Brush("Styling Brush", 3, 100);
        products[2][5] = new Brush("Detangling Brush", 0, 0);
        
        // Initialization of 'HairstylingProduct' subarray
        products[3][0] = new HairstylingProduct("Hairspray", 3, 90);
        products[3][1] = new HairstylingProduct("Clips", 25, 60);
        products[3][2] = new HairstylingProduct("Bobby Pins", 5, 10);
        products[3][3] = new HairstylingProduct("Hair Dryer", 4, 240);
        products[3][4] = new HairstylingProduct("Gel", 2, 20);
        products[3][5] = new HairstylingProduct("Heat Curlers", 2, 152);
        products[3][6] = new HairstylingProduct("Hair Dye", 0, 0);
        products[3][7] = new HairstylingProduct("Hair Foils", 10, 260);
        products[3][8] = new HairstylingProduct("Flat Iron", 5, 200);
        products[3][9] = new HairstylingProduct("Curling Wand", 5, 125);
        products[3][10] = new HairstylingProduct("Hair Ties", 10, 20);
        products[3][11] = new HairstylingProduct("Texturizing Spray", 2, 30);
        products[3][12] = new HairstylingProduct("Men's Clippers", 2, 100);
        products[3][13] = new HairstylingProduct("Wide Tooth Comb", 3, 30);
        products[3][14] = new HairstylingProduct("Diffuser", 3, 60);
        products[3][15] = new HairstylingProduct("Tail Comb", 4, 20);
        products[3][16] = new HairstylingProduct("Curl Cream", 2, 40);
        products[3][17] = new HairstylingProduct("Hair Extension Wires", 3, 60);
        products[3][18] = new HairstylingProduct("Hair Mousse", 4, 40);
        products[3][19] = new HairstylingProduct("Perm Rods", 3, 30);
        products[3][20] = new HairstylingProduct("End Papers", 10, 150);
        products[3][21] = new HairstylingProduct("Perm Kit", 10, 120);
        
        // Initialization of 'OtherUtensil' subarray
        products[4][0] = new OtherUtensil("Barber Shears", 4, 60);
        products[4][1] = new OtherUtensil("Shear Care Kit", 4, 100);
        products[4][2] = new OtherUtensil("Spray Bottle", 4, 20);
        products[4][3] = new OtherUtensil("Hair Colour Mixing Bowl", 10, 50);
        products[4][4] = new OtherUtensil("Gloves", 5, 50);
        products[4][5] = new OtherUtensil("Towels", 12, 92);
        products[4][6] = new OtherUtensil("Cape", 5, 30);
        products[4][7] = new OtherUtensil("Stylist Apron", 5, 100);
        products[4][8] = new OtherUtensil("Hand Mirror", 3, 30);
        products[4][9] = new OtherUtensil("Hand Broom", 1, 15);
        products[4][10] = new OtherUtensil("Vacuum", 1, 35);
        products[4][11] = new OtherUtensil("Paper Towel", 2, 30);
        products[4][12] = new OtherUtensil("Hand Soap", 2, 20);
        products[4][13] = new OtherUtensil("Dust Pan", 1, 4);
        products[4][14] = new OtherUtensil("Cotton Strips", 10, 150);
        products[4][15] = new OtherUtensil("Ring Light", 2, 60);

        // Creation of repetitive menu
        while (true) {
            System.out.println("---------------------------------------");
            System.out.print("MENU\n" +
                             "[1] - View all product info\n" +
                             "[2] - Modify product info\n" +
                             "[3] - View unavailable products\n" +
                             "[4] - Add a product\n" +
                             "[5] – Remove a product\n" +
                             "[6] – Advanced search\n" +
                             "[7] - Exit\n" +
                             "Enter your choice: ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                displayAllProductInfo(products); // Method call to display products
            } else if (choice == 2) {
                modifyProductInfo(products, scanner); // Method call to modify any product info
            } else if (choice == 3) {
                displayUnavailable(products); // Method call to display products whose quantity is 0
            } else if (choice == 4) {
                addProduct(products, scanner);
            } else if (choice == 5) {
                removeProduct(products, scanner);
            } else if (choice == 6) {
                System.out.println("---------------------------------------"); // Repetitive menu for advanced search
                System.out.print("ADVANCED SEARCH\n" +
                                 "[1] - Sort product list alphabetically\n" +
                                 "[2] – Sort product list by quantity\n" +
                                 "[3] - Sort product list by price\n" +
                                 "[4] - Exit\n" +
                                 "Enter your choice: ");
                int advChoice = scanner.nextInt();
                // Calls a method that applies a search filter on the product list depending on user input
                if (advChoice == 1) {
                    sortAlphabetically(products);
                } else if (advChoice == 2) {
                    sortByQty(products);
                } else if (advChoice == 3) {
                    sortByPrice(products);
                } else { // Sends the user back to the menu if an invalid input is given
                }
            } else if (choice == 7) {
                break; // Terminates program
            } else {
            }
        }
    }
    
    /*
    *  Pre: Receives 2D array of products
    *  Post: Displays array's elements using each product instances' toString() methods, and displays each product category
    *  Description: Lists all product names, quantities and prices under each of the five categories
    */
    public static void displayAllProductInfo(Product[][] products) {
        System.out.println("---------------------------------------");
        for (int i = 0; i < products.length; i++) { // Displays all product categories
            if (i == 0) {
                System.out.println(ShampooAndConditioner.getCategory() + "\n");
            } else if (i == 1) {
                System.out.println(Disinfectant.getCategory() + "\n");
            } else if (i == 2) {
                System.out.println(Brush.getCategory() + "\n");
            } else if (i == 3) {
                System.out.println(HairstylingProduct.getCategory() + "\n");
            } else if (i == 4) {
                System.out.println(OtherUtensil.getCategory() + "\n");
            } else {
            }
            for (int j = 0; j < products[i].length; j++) { // Displays products under each category
                System.out.println(products[i][j]);
            }
            if (i == 4) { // Returns to main method before extra line is printed
                return;
            }
            System.out.println();
        }
    }
    
    /*
    *  Pre: Receives 2D array of products and scanner
    *  Post: Replaces any property of any product with another based on user input
    *  Description: Allows the user to select and edit any property of any product
    */
    public static void modifyProductInfo(Product[][] products, Scanner scanner) {
        DecimalFormat format = new DecimalFormat("$#,###0.00"); // Introduce currency formatter
        System.out.println("---------------------------------------");
        System.out.print("Would you like to modify any category name? (Y/N) ");
        String categoryChoice = scanner.next();
        if (categoryChoice.contains("Yes") || categoryChoice.contains("yes") || categoryChoice.equals("y") || categoryChoice.equals("Y")) {
            System.out.println("---------------------------------------");
            System.out.print("PRODUCT CATEGORIES" +
                               "\n[1] - " + ShampooAndConditioner.getCategory() +
                               "\n[2] - " + Disinfectant.getCategory() + 
                               "\n[3] - " + Brush.getCategory() +
                               "\n[4] - " + HairstylingProduct.getCategory() +
                               "\n[5] - " + OtherUtensil.getCategory() +
                               "\n[6] - Exit" + // User can prematurely exit
                               "\nWhich category would you like to rename? (1/2/3/4/5/6) ");
            int categoryChoice2 = scanner.nextInt();
            if (categoryChoice2 == 6) {
                return;
            }
            if (categoryChoice2 != 1 && categoryChoice2 != 2 && categoryChoice2 != 3 && categoryChoice2 != 4 && categoryChoice2 != 5) {
                return; // Sends user back to main menu if invalid input is given
            }
            scanner.nextLine(); // Consumes extra line
            System.out.print("\nWhat will your new category name be? ");
            String inCategory = scanner.nextLine(); // Renames category based on user input
            if (categoryChoice2 == 1) {
                ShampooAndConditioner.setCategory(inCategory);
            } else if (categoryChoice2 == 2) {
                Disinfectant.setCategory(inCategory);
            } else if (categoryChoice2 == 3) {
                Brush.setCategory(inCategory);
            } else if (categoryChoice2 == 4) {
                HairstylingProduct.setCategory(inCategory);
            } else {
                OtherUtensil.setCategory(inCategory);
            }
        } else { // Prompts user with category list if they choose to not rename any category
            System.out.println("---------------------------------------");
            System.out.print("PRODUCT CATEGORIES" +
                               "\n[1] - " + ShampooAndConditioner.getCategory() +
                               "\n[2] - " + Disinfectant.getCategory() + 
                               "\n[3] - " + Brush.getCategory() +
                               "\n[4] - " + HairstylingProduct.getCategory() +
                               "\n[5] - " + OtherUtensil.getCategory() +
                               "\n[6] - Exit" + // User can prematurely exit
                               "\nWhich category would you like to access? ");
            int categoryChoice3 = scanner.nextInt();
            if (categoryChoice3 == 1) {
                System.out.println("---------------------------------------");
                System.out.println(ShampooAndConditioner.getCategory() + "\n");
                for (int i = 0; i < products[0].length; i++) {
                    System.out.println("[" + (i+1) + "] - " + products[0][i]); // Displays all products under selected category
                }
                System.out.print("\nWhich product will you modify? ");
                int productChoice = scanner.nextInt();
                if (productChoice > 2 || productChoice < 1) { // Sends user back to main menu if invalid input is given
                    return;
                }
                System.out.print("\n[1] - Name: " + products[0][productChoice-1].getName() + // User can modify any product property they want
                                   "\n[2] - Qty: " + products[0][productChoice-1].getQuantity() +
                                   "\n[3] - Price: " + format.format(products[0][productChoice-1].getPrice()) +
                                   "\n\nWhich property will you modify? ");
                int propertyChoice = scanner.nextInt();
                if (propertyChoice == 1) {
                    System.out.print("\nWhat will your new name be? "); // User sets new product name
                    scanner.nextLine(); // Consumes extra line
                    String newName = scanner.nextLine();
                    products[0][productChoice-1].setName(newName);
                } else if (propertyChoice == 2) {
                    System.out.print("\nWhat will your new quantity be? "); // User sets new product quantity
                    int newQuantity = scanner.nextInt();
                    products[0][productChoice-1].setQuantity(newQuantity);
                } else if (propertyChoice == 3) {
                    System.out.print("\nWhat will your new price be? "); // User sets new product price
                    double newPrice = scanner.nextDouble();
                    products[0][productChoice-1].setPrice(newPrice);
                } else { // Returns to main menu if any other input is given
                }
            } else if (categoryChoice3 == 2) {
                System.out.println("---------------------------------------");
                System.out.println(Disinfectant.getCategory() + "\n");
                for (int i = 0; i < products[1].length; i++) {
                    System.out.println("[" + (i+1) + "] - " + products[1][i]); // Displays all products under selected category
                }
                System.out.print("\nWhich product will you modify? ");
                int productChoice = scanner.nextInt();
                if (productChoice > 16 || productChoice < 1) { // Sends user back to main menu if invalid input is given
                    return;
                }
                System.out.print("\n[1] - Name: " + products[1][productChoice-1].getName() + // User can modify any product property they want
                                   "\n[2] - Qty: " + products[1][productChoice-1].getQuantity() +
                                   "\n[3] - Price: " + format.format(products[1][productChoice-1].getPrice()) +
                                   "\n\nWhich property will you modify? ");
                int propertyChoice = scanner.nextInt();
                if (propertyChoice == 1) {
                    System.out.print("\nWhat will your new name be? "); // User sets new product name
                    scanner.nextLine(); // Consumes extra line
                    String newName = scanner.nextLine();
                    products[1][productChoice-1].setName(newName);
                } else if (propertyChoice == 2) {
                    System.out.print("\nWhat will your new quantity be? "); // User sets new product quantity
                    int newQuantity = scanner.nextInt();
                    products[1][productChoice-1].setQuantity(newQuantity);
                } else if (propertyChoice == 3) {
                    System.out.print("\nWhat will your new price be? "); // User sets new product price
                    double newPrice = scanner.nextDouble();
                    products[1][productChoice-1].setPrice(newPrice);
                } else { // Returns to main menu if any other input is given
                }
            } else if (categoryChoice3 == 3) {
                System.out.println("---------------------------------------");
                System.out.println(Brush.getCategory() + "\n");
                for (int i = 0; i < products[2].length; i++) {
                    System.out.println("[" + (i+1) + "] - " + products[2][i]); // Displays all products under selected category
                }
                System.out.print("\nWhich product will you modify? ");
                int productChoice = scanner.nextInt();
                if (productChoice > 6 || productChoice < 1) { // Sends user back to main menu if invalid input is given
                    return;
                }
                System.out.print("\n[1] - Name: " + products[2][productChoice-1].getName() + // User can modify any product property they want
                                   "\n[2] - Qty: " + products[2][productChoice-1].getQuantity() +
                                   "\n[3] - Price: " + format.format(products[2][productChoice-1].getPrice()) +
                                   "\n\nWhich property will you modify? ");
                int propertyChoice = scanner.nextInt();
                if (propertyChoice == 1) {
                    System.out.print("\nWhat will your new name be? "); // User sets new product name
                    scanner.nextLine(); // Consumes extra line
                    String newName = scanner.nextLine();
                    products[2][productChoice-1].setName(newName);
                } else if (propertyChoice == 2) {
                    System.out.print("\nWhat will your new quantity be? "); // User sets new product quantity
                    int newQuantity = scanner.nextInt();
                    products[2][productChoice-1].setQuantity(newQuantity);
                } else if (propertyChoice == 3) {
                    System.out.print("\nWhat will your new price be? "); // User sets new product price
                    double newPrice = scanner.nextDouble();
                    products[2][productChoice-1].setPrice(newPrice);
                } else { // Returns to main menu if any other input is given
                }
            } else if (categoryChoice3 == 4) {
                System.out.println("---------------------------------------");
                System.out.println(HairstylingProduct.getCategory() + "\n");
                for (int i = 0; i < products[3].length; i++) {
                    System.out.println("[" + (i+1) + "] - " + products[3][i]); // Displays all products under selected category
                }
                System.out.print("\nWhich product will you modify? ");
                int productChoice = scanner.nextInt();
                if (productChoice > 22 || productChoice < 1) { // Sends user back to main menu if invalid input is given
                    return;
                }
                System.out.print("\n[1] - Name: " + products[3][productChoice-1].getName() + // User can modify any product property they want
                                   "\n[2] - Qty: " + products[3][productChoice-1].getQuantity() +
                                   "\n[3] - Price: " + format.format(products[3][productChoice-1].getPrice()) +
                                   "\n\nWhich property will you modify? ");
                int propertyChoice = scanner.nextInt();
                if (propertyChoice == 1) {
                    System.out.print("\nWhat will your new name be? "); // User sets new product name
                    scanner.nextLine(); // Consumes extra line
                    String newName = scanner.nextLine();
                    products[3][productChoice-1].setName(newName);
                } else if (propertyChoice == 2) {
                    System.out.print("\nWhat will your new quantity be? "); // User sets new product quantity
                    int newQuantity = scanner.nextInt();
                    products[3][productChoice-1].setQuantity(newQuantity);
                } else if (propertyChoice == 3) {
                    System.out.print("\nWhat will your new price be? "); // User sets new product price
                    double newPrice = scanner.nextDouble();
                    products[3][productChoice-1].setPrice(newPrice);
                } else { // Returns to main menu if any other input is given
                }
            } else if (categoryChoice3 == 5) {
                System.out.println("---------------------------------------");
                System.out.println(OtherUtensil.getCategory() + "\n");
                for (int i = 0; i < products[4].length; i++) {
                    System.out.println("[" + (i+1) + "] - " + products[4][i]); // Displays all products under selected category
                }
                System.out.print("\nWhich product will you modify? ");
                int productChoice = scanner.nextInt();
                if (productChoice > 16 || productChoice < 1) { // Sends user back to main menu if invalid input is given
                    return;
                }
                System.out.print("\n[1] - Name: " + products[4][productChoice-1].getName() + // User can modify any product property they want
                                   "\n[2] - Qty: " + products[4][productChoice-1].getQuantity() +
                                   "\n[3] - Price: " + format.format(products[4][productChoice-1].getPrice()) +
                                   "\n\nWhich property will you modify? ");
                int propertyChoice = scanner.nextInt();
                if (propertyChoice == 1) {
                    System.out.print("\nWhat will your new name be? "); // User sets new product name
                    scanner.nextLine(); // Consumes extra line
                    String newName = scanner.nextLine();
                    products[4][productChoice-1].setName(newName);
                } else if (propertyChoice == 2) {
                    System.out.print("\nWhat will your new quantity be? "); // User sets new product quantity
                    int newQuantity = scanner.nextInt();
                    products[4][productChoice-1].setQuantity(newQuantity);
                } else if (propertyChoice == 3) {
                    System.out.print("\nWhat will your new price be? "); // User sets new product price
                    double newPrice = scanner.nextDouble();
                    products[4][productChoice-1].setPrice(newPrice);
                } else { // Returns to main menu if any other input is given
                }
            } else { // Returns to main menu if any other input is given
            }
        }
    }
    
    /*
    *  Pre: Receives 2D array of products
    *  Post: Displays the name and category of any element in the products array with a quantity of 0
    *  Description: Displays the name and category of any out of stock product
    */
    public static void displayUnavailable(Product[][] products) {
        System.out.println("---------------------------------------\n" +
                           "UNAVAILABLE PRODUCTS");
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                if (products[i][j].getQuantity() == 0) { // Displays product if its quantity is 0
                    if (i == 0) { // Displays product with category
                        System.out.println(ShampooAndConditioner.getCategory() + ": " + products[i][j].getName());
                    } else if (i == 1) {
                        System.out.println(Disinfectant.getCategory() + ": " + products[i][j].getName());
                    } else if (i == 2) {
                        System.out.println(Brush.getCategory() + ": " + products[i][j].getName());
                    } else if (i == 3) {
                        System.out.println(HairstylingProduct.getCategory() + ": " + products[i][j].getName());
                    } else {
                        System.out.println(OtherUtensil.getCategory() + ": " + products[i][j].getName());
                    }
                }
            }
        }
    }
    
    /*
    *  Pre: Receives 2D array of products and scanner 
    *  Post: Declares and fills temporary 1D array with 2D subarray contents, increases 2D subarray size by one based on selected category, fills subarray with 1D array contents and creates new product instance depending on user input
    *  Description: Adds custom product to product list
    */
    public static void addProduct(Product[][] products, Scanner scanner) {
        System.out.println("---------------------------------------");
        System.out.print("PRODUCT CATEGORIES" +
                               "\n[1] - " + ShampooAndConditioner.getCategory() +
                               "\n[2] - " + Disinfectant.getCategory() + 
                               "\n[3] - " + Brush.getCategory() +
                               "\n[4] - " + HairstylingProduct.getCategory() +
                               "\n[5] - " + OtherUtensil.getCategory() +
                               "\n[6] - Exit" + // User can prematurely exit
                               "\nWhich category will your new product go under? (1/2/3/4/5/6) ");
        int prodCategory = scanner.nextInt();
        if (prodCategory != 1 && prodCategory != 2 && prodCategory != 3 && prodCategory != 4 && prodCategory != 5) { // Returns to main menu if no category is selected
            return;
        }
        scanner.nextLine();
        System.out.print("\nWhat is your new product's name? "); // User names new product
        String prodName = scanner.nextLine();
        System.out.print("\nWhat is your new product's quantity? "); // User gives quantity of new product
        int prodQty = scanner.nextInt();
        System.out.print("\nWhat is your new product's price? "); // User gives price of new product
        double prodPrice = scanner.nextDouble();
        
        if (prodCategory == 1) {
            Product[] tempArray = new Product[products[0].length]; // Creates a temporary array while the category subarray is allocated with an extra index
            for (int i = 0; i < products[0].length; i++) {
                tempArray[i] = products[0][i]; // Fills temporary array with subarray contents
            }
            products[0] = new ShampooAndConditioner[products[0].length + 1];
            for (int i = 0; i < tempArray.length; i++) {
                products[0][i] = tempArray[i]; // Fills modified subarray with temporary array
            }
            products[0][products[0].length - 1] = new ShampooAndConditioner(prodName, prodQty, prodPrice); // Assigns new element to new column of products array
        } else if (prodCategory == 2) {
            Product[] tempArray = new Product[products[1].length]; // Creates a temporary array while the category subarray is allocated with an extra index
            for (int i = 0; i < products[1].length; i++) {
                tempArray[i] = products[1][i]; // Fills temporary array with subarray contents
            }
            products[1] = new Disinfectant[products[1].length + 1];
            for (int i = 0; i < tempArray.length; i++) {
                products[1][i] = tempArray[i]; // Fills modified subarray with temporary array
            }
            products[1][products[1].length - 1] = new Disinfectant(prodName, prodQty, prodPrice);
        } else if (prodCategory == 3) {
            Product[] tempArray = new Product[products[2].length]; // Creates a temporary array while the category subarray is allocated with an extra index
            for (int i = 0; i < products[2].length; i++) {
                tempArray[i] = products[2][i]; // Fills temporary array with subarray contents
            }
            products[2] = new Brush[products[2].length + 1];
            for (int i = 0; i < tempArray.length; i++) {
                products[2][i] = tempArray[i]; // Fills modified subarray with temporary array
            }
            products[2][products[2].length - 1] = new Brush(prodName, prodQty, prodPrice);
        } else if (prodCategory == 4) {
            Product[] tempArray = new Product[products[3].length]; // Creates a temporary array while the category subarray is allocated with an extra index
            for (int i = 0; i < products[3].length; i++) {
                tempArray[i] = products[3][i]; // Fills temporary array with subarray contents
            }
            products[3] = new HairstylingProduct[products[3].length + 1];
            for (int i = 0; i < tempArray.length; i++) {
                products[3][i] = tempArray[i]; // Fills modified subarray with temporary array
            }
            products[3][products[3].length - 1] = new HairstylingProduct(prodName, prodQty, prodPrice);
        } else if (prodCategory == 5) {
            Product[] tempArray = new Product[products[4].length]; // Creates a temporary array while the category subarray is allocated with an extra index
            for (int i = 0; i < products[4].length; i++) {
                tempArray[i] = products[4][i]; // Fills temporary array with subarray contents
            }
            products[4] = new OtherUtensil[products[4].length + 1];
            for (int i = 0; i < tempArray.length; i++) {
                products[4][i] = tempArray[i]; // Fills modified subarray with temporary array
            }
            products[4][products[4].length - 1] = new OtherUtensil(prodName, prodQty, prodPrice);
        }
    }
    
    /*
    *  Pre: Receives 2D array of products and scanner 
    *  Post: Overwrites 2D subarray starting on index of selected service, declares and fills 1D temporary array with subarray contents, reduces 2D subarray size by 1, and fills subarray with 1D array contents
    *  Description: Removes product from product list based on user input
    */
    public static void removeProduct(Product[][] products, Scanner scanner) {
        scanner.nextLine();
        displayAllProductInfo(products); // Displays all products to user before removal
        System.out.print("\nEnter the name of the product you want to remove: ");
        String removedProduct = scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                // Searches for user-inputted product (not case-senetive)
                if (products[i][j].getName().equals(removedProduct) || products[i][j].getName().toLowerCase().equals(removedProduct)) {
                    for (int k = j; k < products[i].length - 1; k++) {
                        products[i][k] = products[i][k + 1]; // Fills products array with contents starting from index above current index (overwrites current index)
                    }
                    Product[] tempArray = new Product[products[i].length - 1]; // Declares temporary array
                    for (int k = 0; k < tempArray.length; k++) {
                        tempArray[k] = products[i][k]; // Fills temporary array with products subarray contents
                    }
                    products[i] = new Product[products[i].length - 1]; // Reduces products subarray size by one to account for product removal
                    for (int k = 0; k < products[i].length; k++) {
                        products[i][k] = tempArray[k]; // Fills products subarray with temporary array
                    }
                    System.out.println("\nProduct was successfully removed."); // Notifies user of product removal
                    return;
                }
            }
        }
        System.out.println("\nProduct not found."); // If product removal is unsuccessful, notifies user
    }
    
    /*
    *  Pre: Receives 2D array of products
    *  Post: Swaps array elements if the current array element contains a name that begins with a letter that comes after the compared array element's name. Then, prints the ordered list
    *  Description: Lists the products in alphabetical order under each category (ascending)
    */
    public static void sortAlphabetically(Product[][] products) {
        System.out.println("---------------------------------------" +
                           "\nSORTED ALPHABETICALLY (ASCENDING):\n");
        for (int category = 0; category < products.length; category++) {
            for (int i = 0; i < products[category].length; i++) {
                for (int j = i+1; j < products[category].length; j++) {
                    if (products[category][i].getName().compareTo(products[category][j].getName()) > 0) {
                        Product current = products[category][i];
                        products[category][i] = products[category][j];
                        products[category][j] = current;
                    }
                }
            }
            if (category == 0) { // Displays product list with categories
                System.out.println(ShampooAndConditioner.getCategory() + "\n");
            } else if (category == 1) {
                System.out.println(Disinfectant.getCategory() + "\n");
            } else if (category == 2) {
                System.out.println(Brush.getCategory() + "\n");
            } else if (category == 3) {
                System.out.println(HairstylingProduct.getCategory() + "\n");
            } else if (category == 4) {
                System.out.println(OtherUtensil.getCategory() + "\n");
            }
            for (int i = 0; i < products[category].length; i++) {
                System.out.println(products[category][i]);
            }
            if (category == 4) { // Returns to main method before extra line is printed
                return;
            }
            System.out.println();
        }
    }
    
    /*
    *  Pre: Receives 2D array of products
    *  Post: Uses insertion sort to sort array elements in order of quantity, and prints ordered list afterward
    *  Description: Lists the products in order of quantity under each category (ascending)
    */
    public static void sortByQty(Product[][] products) {
        System.out.println("---------------------------------------" +
                           "\nSORTED BY QUANTITY (ASCENDING):\n");
        for (int category = 0; category < products.length; category++) { // 'category' increases so that each array row/category is accessed
            for (int j = 1; j < products[category].length; j++) {
                Product current = products[category][j]; // The 'current' variable contains an element that will swap with the next array element if currentQty is less than the quantity of the next array element's quantity
                int currentQty = products[category][j].getQuantity(); // Two 'current' variables are used; currentQty will be compared with the quantities of other index instances
                int i = j-1;
                while ((i > -1) && (products[category][i].getQuantity() > currentQty)) { // Swaps if the next element (i) has a greater quantity than the current element (j) and if i not reached the end of the array column (i > -1)
                    products[category][i+1] = products[category][i];
                    i--; // 'Next element' variable (i) decrements until end of array column is reached
                }
                products[category][i+1] = current;
            }
            if (category == 0) { // Displays product list with categories
                System.out.println(ShampooAndConditioner.getCategory() + "\n");
            } else if (category == 1) {
                System.out.println(Disinfectant.getCategory() + "\n");
            } else if (category == 2) {
                System.out.println(Brush.getCategory() + "\n");
            } else if (category == 3) {
                System.out.println(HairstylingProduct.getCategory() + "\n");
            } else if (category == 4) {
                System.out.println(OtherUtensil.getCategory() + "\n");
            }
            for (int i = 0; i < products[category].length; i++) {
                System.out.println(products[category][i]);
            }
            if (category == 4) { // Returns to main method before extra line is printed
                return;
            }
            System.out.println();
        }
    }
    
    /*
    *  Pre: Receives 2D array of products
    *  Post: Uses insertion sort to sort array elements in order of price, and prints ordered list afterward
    *  Description: Lists the products in order of price under each category (ascending)
    */
    public static void sortByPrice(Product[][] products) {
        System.out.println("---------------------------------------" +
                           "\nSORTED BY PRICE (ASCENDING):\n");
        for (int category = 0; category < products.length; category++) { // 'category' increases so that each array row/category is accessed
            for (int j = 1; j < products[category].length; j++) {
                Product current = products[category][j]; // The 'current' variable contains an element that will swap with the next array element if currentPrice is less than the price of the next array element's price
                double currentPrice = products[category][j].getPrice(); // Two 'current' variables are used; currentPrice will be compared with the prices of other index instances
                int i = j-1;
                while ((i > -1) && (products[category][i].getPrice() > currentPrice)) { // Swaps if the next element (i) has a greater quantity than the current element (j) and if i not reached the end of the array column (i > -1)
                    products[category][i+1] = products[category][i];
                    i--; // 'Next element' variable (i) decrements until end of array column is reached
                }
                products[category][i+1] = current;
            }
            if (category == 0) { // Displays product list with categories
                System.out.println(ShampooAndConditioner.getCategory() + "\n");
            } else if (category == 1) {
                System.out.println(Disinfectant.getCategory() + "\n");
            } else if (category == 2) {
                System.out.println(Brush.getCategory() + "\n");
            } else if (category == 3) {
                System.out.println(HairstylingProduct.getCategory() + "\n");
            } else if (category == 4) {
                System.out.println(OtherUtensil.getCategory() + "\n");
            }
            for (int i = 0; i < products[category].length; i++) { // Displays all products under selected category
                System.out.println(products[category][i]);
            }
            if (category == 4) { // Returns to main method before extra line is printed
                return;
            }
            System.out.println();
        }
    }
}
public class Disinfectant extends Product {
    private static String category = "Disinfectant Products";
    
    // Constructors
    public Disinfectant() {
        super();
    }
    
    public Disinfectant(String inName, int inQuantity, double inPrice) {
        super(inName, inQuantity, inPrice);
    }
    
    // Accessor method
    public static String getCategory() {
        return category;
    }
    
    // Modifier method
    public static void setCategory(String inCategory) {
        category = inCategory;
    }
    
    // toString() method
    public String toString() {
        return super.getQuantity() + "x " + super.getName() + ": " + format.format(super.getPrice());
    }
}
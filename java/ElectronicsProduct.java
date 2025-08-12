import java.util.Scanner;

public class ElectronicsProduct {
    String productID, productName;
    double productPrice, discount;

    public ElectronicsProduct(String productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public void calDiscount() {
        Scanner scan = new Scanner(System.in);
        
        if (productPrice >= 5000) {
            discount = 0.25;
        }
        else if (productPrice >= 3000) {
            discount = 0.15;
        }
        else if (productPrice >= 2999) {
            discount = 0.10;
        }
        
        productPrice = productPrice - productPrice * discount;
    }
    public void display() {
        System.out.println("Discount: " + discount);
        System.out.println("Discounted Price: " + productPrice);
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }
}

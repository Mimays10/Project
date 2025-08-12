import java.util.Scanner;
public class TestElectronic {
    
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name = System.console().readLine();
        System.out.println("Enter product ID: ");
        String ID = System.console().readLine();
        System.out.println("Enter product Price: ");
        double price = scan.nextDouble();
        ElectronicsProduct product = new ElectronicsProduct(name, ID, price);
        
        product.calDiscount();
        product.display();
    }
}

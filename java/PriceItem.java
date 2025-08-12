import java.util.Scanner;
import java.util.InputMismatchException;

public class PriceItem {
    private double[] price;
    public double discount;

    public PriceItem(int num) {
        this.price = new double[num];
    }

    public void enterPrices() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter 5 price item (RM): ");
            for (int i = 0; i < 5; i++) {
                System.out.print("");
                price[i] = sc.nextDouble();
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input: Only number accepted for price.");
            sc.next();
        }
    }

    public void enterDiscount() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter discount given (%): ");
            discount = sc.nextDouble();

            if (discount < 0 || discount > 100) {
                System.out.println("Wrong input: Discount should not be negative or higher than 100.");
                discount = 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input: Discount should not be negative or higher than 100.");
            sc.next();
        }
    }

    public void display() {
        double totalPrice = 0;

        for (double p : price) {
            totalPrice += p;
        }

        double priceDis = totalPrice * discount / 100;
        double priceAfterDis = totalPrice - priceDis;

        System.out.println("=====DETAILS INFORMATION=====");
        System.out.println("\nDiscount: " + discount + "%");
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Price Discount: RM" + priceDis);
        System.out.println("Price After Discount: RM" + priceAfterDis);
        System.out.println("\n---------------------------");
        System.out.println("THANK YOU FOR YOUR PURCHASE");
    }
}

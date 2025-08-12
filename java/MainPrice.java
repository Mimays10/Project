import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPrice {
    public static void main(String[] args) {
        PriceItem priceItem = new PriceItem(5);
        priceItem.enterPrices();
        priceItem.enterDiscount();
        priceItem.display();
    }
}

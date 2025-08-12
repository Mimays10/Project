import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareFix {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer: ");
        try {
            num = scan.nextInt();
            System.out.println("The square of " + num + " is " + (num * num));
        } catch (InputMismatchException ex) {
            System.out.println("You entered a bad data.");
            System.out.println("Run the program again.");
        }
        System.out.println("Good bye!");
    }
}

import java.util.Scanner;
public class Bus extends Vehicle1 {
    int length;
    public Bus(String brand, String model, int year, int length) {
        super(brand, model, year);
    }

    public void display() {
        System.out.print("Enter the length of bus: ");
        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
    }

    public void displayBus() {
        super.display();
        System.out.println("Length of bus: " + length);
    }
}

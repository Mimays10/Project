import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        String brand, model;
        int year, option;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter brand: ");
        brand = scan.nextLine();
        System.out.print("Enter model: ");
        model = scan.nextLine();
        System.out.print("Enter year: ");
        year = scan.nextInt();
        System.out.print("Enter 1 for Car, 2 for Bus: ");
        option = scan.nextInt();
        if (option == 1) {
            Car1 car = new Car1(brand, model, year);
            car.display();
            car.displayCar();
        } else if (option == 2) {
            Bus bus = new Bus(brand, model, year, 0);
            bus.display();
            bus.displayBus();
        } else {
            System.out.println("Invalid input");
        }
    }
}

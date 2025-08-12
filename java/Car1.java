import java.util.Scanner;
public class Car1 extends Vehicle1 {
    
    String typeCar;
    int Passengers;

    public Car1( String brand, String model, int year) {
        super(brand, model, year);
    }

    public void display() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your type of Car: ");
        typeCar = scan.nextLine();
        System.out.print("Enter number of Passengers: ");
        Passengers = scan.nextInt();
    }
    public void displayCar() {
        super.display();
        System.out.println("Car Type: " + typeCar);
        System.out.println("Number of Passengers: " + Passengers);
    }
}

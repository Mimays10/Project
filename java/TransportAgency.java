import java.util.Scanner;
public class TransportAgency {
    public static void main(String[] args) {
        System.out.println("WELCOME TO MKN RENTAL TRANSPORT AGENCY");
        System.out.println("=======================================");
        System.out.println("Type\t\tHour\tDaily\tdiscount per/daily");
        System.out.println("Car\t\tRM15\tRM120\t\t10%");
        System.out.println("Motorbike\tRM10\tRM60\t\t15%");
        System.out.println("=======================================");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the type of transport to rent (Car/Motorbike):");
        String type = scan.nextLine();

        System.out.println("Enter the number of hours:");
        int hours = scan.nextInt();

        System.out.println("Enter the number of days:");
        int days = scan.nextInt();

        if (type.equalsIgnoreCase("Car")) {
            Car car = new Car();
            car.calculateTotalCost(hours, days);
        } 
        else if (type.equalsIgnoreCase("Motorbike")) {
            Motorbike motorbike = new Motorbike();
            motorbike.calculateTotalCost(hours, days);
        }   
        else {
            System.out.println("Invalid input");
        }
    }
}
import java.util.Scanner;
public class Transport {
    double ratePerHour, ratePerDay, discount;

    public Transport(double ratePerHour, double ratePerDay, double discount) {

        this.ratePerHour = ratePerHour;
        this.ratePerDay = ratePerDay;
        this.discount = discount;        
    }
    public void display() {
        System.out.println("Rate per hour: " + ratePerHour);
        System.out.println("Rate per day: " + ratePerDay);
    }
}

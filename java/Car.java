public class Car extends Transport {

    public Car() {
        super(15.0, 120.0, 0.1);
    }
    public void calculateTotalCost(int hours, int days) {
        Transport transport = new Transport(ratePerHour, ratePerDay, discount);
        if (days > 0) {
            double totalCost = (hours * ratePerHour) + (days * ratePerDay);
            totalCost -= totalCost * discount;
            System.out.println("Transport: Car");
            transport.display();
            System.out.println("Total cost for " + hours + " hours and " + days + " days: RM" + totalCost);
        }
        else {
        System.out.println("Transport: Car");
        transport.display();
        System.out.println("Total cost for " + hours + " hours and " + days + " days: RM" + (hours * 15.0));
        }
    }
}

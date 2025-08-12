public class Motorbike extends Transport{

    public Motorbike(){
        super(10.0, 60.0, 0.15);
    }
    public void calculateTotalCost(int hours, int days) {
        Transport transport = new Transport(ratePerHour, ratePerDay, discount);
        if (days > 0) {
            double totalCost = (hours * ratePerHour) + (days * ratePerDay);
            totalCost -= totalCost * discount; //CALCULATE DISCOUNT
            System.out.println("Transport: Motorbike");
            transport.display();
            System.out.println("Total cost for " + hours + " hours and " + days + " days: RM" + totalCost);
        }
        else {
        System.out.println("Transport: Motorbike");
        transport.display();
        System.out.println("Total cost for " + hours + " hours and " + days + " days: RM" + (hours * 10.0));
        }
    }
}

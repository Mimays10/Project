public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new Bank(8.4f);
        System.out.println("Rate of Interest SBI: " + b1.getRateOfInterest());
        Bank b2 = new Bank(7.3f);
        System.out.println("Rate of Interest ICICI: " + b2.getRateOfInterest());
        Bank b3 = new Bank(9.7f);
        System.out.println("Rate of Interest AXIS: " + b3.getRateOfInterest());
    }
}

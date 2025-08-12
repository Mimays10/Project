import java.util.Scanner;
public class Car2 extends Vehicle2 {
    int type;
    
    public void Cartype() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Super Car = 1");
        System.out.println("Sports Car = 2");
        System.out.println("Family Car = 3");
        System.out.print("Which is your dream car? ");
        type = scan.next().charAt(0);
        if (type == '1') {
            System.out.println("BILLIONARE");
        } else if (type == '2') {
            System.out.println("MILLIONARE");
        } else if (type == '3') {
            System.out.println("WOW");
        }
    }
}

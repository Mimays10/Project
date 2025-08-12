import java.util.Scanner;
public class My_Calculation extends Calculation {

    public void multiplication(int num1, int num2) {
        
        int mul = num1 * num2;
        System.out.println("The product of the given numbers: " + mul); 
    }

    public static void main(String[] args) {
        int a = 20, b = 10;
        My_Calculation obj = new My_Calculation();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter num 1: ");
        a = scan.nextInt();
        System.out.print("Please enter num 2: ");
        b = scan.nextInt();
    
        obj.addition(a, b);
        obj.subtraction(a, b);
        obj.multiplication(a, b);
        obj.difference(a, b);
        
    }
}

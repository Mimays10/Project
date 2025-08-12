import java.io.IOException;
import java.util.Scanner;
class FinallyDemo {
    public static void main(String[] args) {
        int a, b;
        double c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        a = sc.nextInt();
        System.out.print("Enter the value of b :");
        b = sc.nextInt();
        c=b/a;
        
        try{
            System.out.println(c);
        }
        catch(ArithmeticException e){
            if (c <= 0){
            System.out.println("invalid input");
            }
        }
        finally{
            System.out.println("answer is ");
        }
    }
}

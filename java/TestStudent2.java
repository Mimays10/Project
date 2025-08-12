import java.util.Scanner;

public class TestStudent2 {
    public static void main(String[] args) {
        String name, ic, matrixNum;
        int option;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = scan.nextLine();
        System.out.print("Enter IC number : ");
        ic = scan.nextLine();
        System.out.print("Enter matrix number : ");
        matrixNum = scan.nextLine();
        System.out.print("Enter 1 for FullTime, 2 for PartTime : ");
        option = scan.nextInt();
        if (option == 1) {
            FullTime ft = new FullTime(name, ic, matrixNum);
            ft.displayFullTime(name, ic, matrixNum, 1);
        } else if (option == 2) {
            PartTime pt = new PartTime(name, ic, matrixNum);
            pt.displayPartTime();
        } else {
            System.out.println("Invalid input");
        }
    }
}

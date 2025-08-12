import java.util.Scanner;

public class PartTime extends Student1 {
    int subjects;
    public PartTime(String name, String ic, String matrixNum) {
        super(name, ic, matrixNum);
    }

    public void displayPartTime() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of subjects: ");
        subjects = scan.nextInt();
        System.out.println("Your fees for this semester RM " + subjects*500);
    }
}

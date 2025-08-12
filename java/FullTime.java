public class FullTime extends Student1 {
    public FullTime(String name, String ic, String matrixNum) {
        super(name, ic, matrixNum);
    }
    public void displayFullTime(String name, String ic, String matrixNum, int sem) {
        super.display();
        System.out.println("Your fees for this semester is RM2000");
    }
}

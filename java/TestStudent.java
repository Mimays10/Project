import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.lang.IllegalArgumentException;
public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculateGrade student = new CalculateGrade(scanner);

        try {
        
            student.calculateTotalMarks();
            student.calculateAvgMarks();
            student.calcGrade();
            
            student.display();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

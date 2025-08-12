import java.util.Scanner;
class CalculateGrade extends Student {
    
    public CalculateGrade(Scanner scanner) {
        
        StudentInfo(scanner);
        enterMarks(scanner);display();
    }
    public void calculateTotalMarks() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
    }
    public void calculateAvgMarks() {
        avgMarks = totalMarks / (double) marks.length;
    }
    @Override
    public void calcGrade() {
        if (avgMarks >= 90) {
            grade = 'A';
        } else if (avgMarks >= 80) {
            grade = 'B';
        } else if (avgMarks >= 70) {
            grade = 'C';
        } else if (avgMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }
}

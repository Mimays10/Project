import java.util.Scanner;

abstract class Student {
    public String name;
    public String className;
    protected int[] marks = new int[5];
    protected int totalMarks;
    protected double avgMarks;
    protected char grade;

    public void StudentInfo(Scanner scanner) {
        System.out.print("Enter student's name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter student's class: ");
        this.className = scanner.nextLine();
    }
    public void enterMarks(Scanner scanner) throws IllegalArgumentException {
        String[] subjects = {"BM", "BI", "Math", "Science", "History"};
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            int mark = scanner.nextInt();
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Invalid Processing: Marks should be between 0 and 100.");
            }
            marks[i] = mark;
        }
    }
    public void display() {
        System.out.println("------- Student Information -------");
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("\n----------- Marks Entered -----------");
        System.out.printf("BM: %d%n", marks[0]);
        System.out.printf("BI: %d%n", marks[1]);
        System.out.printf("MATH: %d%n", marks[2]);
        System.out.printf("SCIENCE: %d%n", marks[3]);
        System.out.printf("HISTORY: %d%n", marks[4]);
        System.out.println("\n------------------------------------");
        System.out.printf("Total Marks: %d%n", totalMarks);
        System.out.printf("Average Marks: %.1f%n", avgMarks);
        System.out.println("Grade: " + grade);
    }
    
    public abstract void calcGrade();
    
}

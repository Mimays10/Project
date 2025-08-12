public class Student1 {    
    
    String name;
    String ic;
    String matrixNum;
    
    public Student1(String name, String ic, String matrixNum) {
        this.name = name;
        this.ic = ic;
        this.matrixNum = matrixNum;
        
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("IC: " + ic);
        System.out.println("Matrix Number: " + matrixNum);
    }
}

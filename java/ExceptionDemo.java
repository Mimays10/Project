import java.io.*;
public class ExceptionDemo {
    public static void main(String[] args) {
        String[] house = {"Gryfindor","Slytherin","Ravenclaw"};
        try {
            for(int i=0;i<4;i++){
                System.out.println(house[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception : Array Index Out Of Bounds");
        } finally {
            System.out.println("This is always executed");
        }
    }
}

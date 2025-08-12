import java.util.Scanner;
public class Shape {
    int area;
    int width;
    int height;
    public void area() {
        Rectangle r = new Rectangle();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the width: ");
        width = scan.nextInt();
        System.out.print("Please enter the height: ");
        height = scan.nextInt();

        r.width = width;
        System.out.println("Width of the shape " + r.width);
        r.height = height;
        System.out.println("Height of the shape " + r.height);
        r.t_area();
    }

}

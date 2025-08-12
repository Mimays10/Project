
public class Calculation {

    int sum;
    float subs;
    public void addition(int num1, int num2) {
        
        sum = num1 + num2;
        System.out.println("The sum of the given numbers: " + sum);
    }
    public void subtraction(int num1, int num2) {
        subs = num1 - num2;
        System.out.println("The difference between the given numberrs: " + subs);
    }
    public void difference(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " greater than " + num2);
        } else {
            System.out.println(num1 + " less than " + num2);
        }
    }
}
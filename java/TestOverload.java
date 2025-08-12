public class TestOverload {
    public static void main(String[] args) {
    MethodOverload ob = new MethodOverload();
    double result;

    ob.add();
    ob.add(10, 20);
    result = ob.add(10.5, 20.9);
    System.out.println("Result: " + result);
    }
}

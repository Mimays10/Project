public class MethodOverload {
    
    public static void main(String[] args) {
        double cube, coboid, lt = 5, bt = 10.5, ht = 6;
        //double sphere, cylinder, rad = 4, ht = 6;
        ShapeVolume sv = new ShapeVolume();
        cube = sv.volume(lt);
        coboid = sv.volume(lt, bt, ht);
        System.out.println("The volume of Sphere is " + cube);
        System.out.println("The volume of Cylinder is " + coboid);
    }
    /*void add(){
        System.out.println("No parameters");
    }
    
    void add(int num1 ,int num2){
        int sum = num1 + num2;
        System.out.println("add 2 integers. Result " + sum);
    
    }
    double add(double num1, double num2){
        double result = num1 + num2;
        System.out.print("add 2 doubles numbers ");
        return result;
    }*/

}

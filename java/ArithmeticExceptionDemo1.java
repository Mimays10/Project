class ArithmeticExceptionDemo1 {
    public static void main(String[] args) {  
        int output = 0;
        try{
        int num1 = 30, num2 = 0;
        output = num1 / num2;
        System.out.println("Result = " + output);
        }
        catch(ArithmeticException e){
            System.out.println("num2 is zero.. will cause Arithmetic Exception");
        }
        finally{
            System.out.println("****Done****");
        }
    }
}

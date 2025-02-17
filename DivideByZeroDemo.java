//  Write  a  program  to  show  divide  by  zero 
//  error  through  exception,  and  also  try  to 
//  catch the exception

 public class DivideByZeroDemo {
    public static void main(String[] args) {
        try {
            int result = 10/0; // This will throw an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

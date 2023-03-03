// Write a java program to implement exception handling. 
public class prac9c {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println("The value of C is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed: " + e);
        }
    }
}

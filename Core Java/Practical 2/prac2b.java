// WAP to convert Decimal number to Binary number and vice-versa.
import java.util.Scanner;

class prac2b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Decimal number: ");
        int decimalNum = sc.nextInt();
        // Decimal to binary number
        String binaryNum = Integer.toBinaryString(decimalNum);
        System.out.println("Binary number from Decimal number: " + binaryNum);
        System.out.println("Decimal number from Binary number: " + Integer.parseInt(binaryNum, 2));
    }
}

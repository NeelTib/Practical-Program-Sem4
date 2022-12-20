// Write a Java code to add 2 binary numbers.

import java.util.Scanner;

public class prac2a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long binary1, binary2;
        int i = 0, remainder = 0;
        int sum[] = new int[0];
        System.out.println("Input the first binary number: ");
        binary1 = sc.nextLong();
        System.out.println("Input the second binary number: ");
        binary2 = sc.nextLong();

        while (binary1 != 0 || binary2 != 0) {
            sum[i] = (int) (binary1 % 10 + binary2 % 10 + remainder) % 2;
            sum[i] = (int) (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 /= 10;
            binary2 /= 10;
            i++;
        }
        if (remainder != 0) {
            sum[i] = remainder;
            i++;
        }
        --i;
        System.out.println("Sum of two binary digits: ");
        while (i >= 0) {
            System.out.print(sum[i]);
            i--;
        }
    }
}
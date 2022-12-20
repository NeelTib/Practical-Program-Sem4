// Write a pgm that takes a number as input & prints its multiple table upto 10

import java.util.Scanner;

public class prac1a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of " + 5 + " is");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}

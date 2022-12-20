// Write a Java code to find the area and perimeter of a circle

import java.util.Scanner;

public class prac1c {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        float radi = sc.nextFloat();
        float area = 3.142f * radi * radi;
        float perimeter = 2 * 3.142f * radi;
        System.out.println("Area of Circle: " + area);
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}

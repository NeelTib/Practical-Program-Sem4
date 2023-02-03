// Design a class to sort data contains the method ascending and descending

import java.util.*;

public class prac4a {
    Scanner input = new Scanner(System.in);
    int num, i;
    int arr[], temp = 0;

    // Function to get the data 
    public void getData() {
        System.out.println("Input the size of array: ");
        num = input.nextInt();
        System.out.println("Input the elements of array: ");
        arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
    }

    // Function to display the inputted data
    void putData() {
        System.out.println("Inputted numbers are: ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to sort the data in ascending order
    void ascending() {
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    // Function to sort the data in descending order
    void descending() {
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    // Function to display the sorted data
    void display() {
        System.out.println("\nAscending order of number: ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Main function
    public static void main(String[] args) {
        prac4a ab = new prac4a();
        ab.getData();
        ab.putData();
        ab.ascending();
        ab.display();
        ab.descending();
        ab.display();
    }
}

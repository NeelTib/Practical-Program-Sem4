// Write a program to add 2 matrices and print the result in matrix. 
import java.util.Scanner;

public class prac6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;

        // Taking row and column as the input
        System.out.print("Input the row: ");
        row = sc.nextInt();
        System.out.print("Input the column: ");
        column = sc.nextInt();
        int mat1[][] = new int[row][column];
        int mat2[][] = new int[row][column];
        int mat3[][] = new int[row][column];

        // Taking the matrix 1 as input
        System.out.println("Input a " + row + "x" + column + " matrix1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Taking the matrix 2 as input
        System.out.println("Input a " + row + "x" + column + " matrix2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Displaying matrix 1
        System.out.println("Matrix 1: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        // Displaying matrix 2
        System.out.println("Matrix 2: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        // Adding matrix1 and matrix2
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Displaying matrix 3 which is addition of matrix 1 and matrix 2
        System.out.println("Addition: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

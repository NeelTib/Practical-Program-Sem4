// Write a java program for multiplying two matrices and print the product for the same. 
import java.util.Scanner;

public class prac6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1, column1;
        int row2, column2;

        // Taking row and column of matrix 1 as the input
        System.out.print("Input the row of matrix 1: ");
        row1 = sc.nextInt();
        System.out.print("Input the column of matrix 1: ");
        column1 = sc.nextInt();
        // Taking row and column of matrix 2 as the input
        System.out.print("Input the row of matrix 2: ");
        row2 = sc.nextInt();
        System.out.print("Input the column of matrix 2: ");
        column2 = sc.nextInt();

        int mat1[][] = new int[row1][column1];
        int mat2[][] = new int[row2][column2];
        int mat3[][] = new int[row1][column2];

        // Taking the matrix 1 as input
        System.out.println("Input a " + row1 + "x" + column1 + " matrix1:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Taking the matrix 2 as input
        System.out.println("Input a " + row2 + "x" + column2 + " matrix2:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Displaying matrix 1
        System.out.println("Matrix 1: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        // Displaying matrix 2
        System.out.println("Matrix 2: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        if (row1 == column2)

        {
            System.out.println("Matrix multiplication is possible");
            int sum = 0;
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < column2; k++) {
                        sum += mat1[i][k] * mat2[k][j];
                    }
                    mat3[i][j] = sum;
                    sum = 0;
                }
            }

            // Displying resultant matrix
            System.out.println("Resultant matrix: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.print(mat3[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matix multiplication is not possible");
        }
    }
}

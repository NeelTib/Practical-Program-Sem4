// Write a java program to read the student data from user and store it in the file. 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class prac8c {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Object creation
        FileOutputStream os = new FileOutputStream("studentData.txt");
        Scanner sc = new Scanner(System.in);

        // Variable declartion
        String name, std;

        // User Input
        System.out.println("Input your name: ");
        name = sc.nextLine();
        System.out.println("Input your class: ");
        std = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Class: " + std);
        // Writing data to the file
        byte byteName[] = name.getBytes();
        os.write(byteName);
        byte byteStd[] = std.getBytes();
        os.write(byteStd);

        System.out.println("Data has been successfully stored in studentData.txt file ");
    }
}

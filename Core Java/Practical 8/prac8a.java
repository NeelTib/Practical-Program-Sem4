// Write a java program to open a file and display the
// contents in the console window. 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class prac8a {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream is = new FileInputStream("text1.txt");
        int count = is.available();
        byte a[] = new byte[count];
        is.read(a);
        System.out.println("Data read from file is: ");
        for (byte b : a) {
            char k = (char) b;
            System.out.print(k);
        }
    }
}

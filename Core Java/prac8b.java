import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class prac8b {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream is = new FileInputStream("text1.txt");
        FileOutputStream os = new FileOutputStream("copiedFile.txt");

        int i;
        while ((i = is.read()) != -1) {
            os.write((char) i);
        }
        System.out.println("Data has been copied!!! A new file copiedFile.txt with copied has been created.");
    }
}

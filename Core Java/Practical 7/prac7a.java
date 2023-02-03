// Vectors & Multi
// WAP to implement vectors.
import java.util.*;

public class prac7a {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement(new Integer(100));
        v.addElement(new Double(4.5465));
        v.addElement(new String("Java Vector"));
        System.out.println("Vector capacity: " + v.capacity());
        System.out.println("Vector Size: " + v.size());
        System.out.println("Displaying elements");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }
        v.removeElement(1);
        v.removeElement("Java Vector");
        System.out.println("First Element: " + v.firstElement());
        System.out.println("Last Element: " + v.lastElement());
        v.removeAllElements();
        System.out.println("Vector empty: " + v.isEmpty());
    }
}

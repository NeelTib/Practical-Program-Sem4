
// WAP to reverse a string.
import java.util.Scanner;

class prac2c {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc.nextLine();
        String newStr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            newStr = ch + newStr;
        }
        System.out.println(newStr);
    }
}

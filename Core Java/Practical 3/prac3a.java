import java.util.Scanner;
import java.lang.Character;

class prac3a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int alpha = 0, num = 0, specialChar = 0, space = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(ch[i]))
                alpha++;
            else if (Character.isDigit(ch[i]))
                num++;
            else if (Character.isSpaceChar(ch[i]))
                space++;
            else
                specialChar++;
        }
        System.out.println("Letter: " + alpha);
        System.out.println("Digit: " + num);
        System.out.println("Spaces: " + space);
        System.out.println("Special Characters: " + specialChar);

    }
}

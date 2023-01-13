import java.util.Scanner;

class prac3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        System.out.println("Input the element: ");
        for (int i = 0; i < 5; i++)
            num[i] = sc.nextInt();
        int min = num[0];
        int max = num[0];
        for (int j = 1; j < 5; j++) {
            if (num[j] < min)
                min = num[j];
            if (num[j] > max)
                max = num[j];
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

class prac3b {
    public static void main(String args[]) {
        long sum = calc();
        System.out.println("Sum: " + sum);
    }

    public static long calc() {
        char c[] = { '0', '1', '2', '4', '5', '6', '7', '8', '9' };
        long sum = 0;
        int x = 0, i = 0;
        while (i < c.length) {
            x = Character.getNumericValue((c[i]));
            sum = sum + x;
            i++;
        }
        return sum;
    }
}

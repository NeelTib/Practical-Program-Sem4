class Multi extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread: " + i);
        }
        System.out.println("Exit from Multi");
    }
}

public class main7b {
    public static void main(String[] args) {
        Multi m = new Multi();
        m.start();
    }
}
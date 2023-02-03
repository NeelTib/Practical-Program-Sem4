// WAP to implement thread lifecycle.

class A extends Thread {
    public void run() {
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                Thread.yield();
            }
            System.out.println("Thread A i: " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 3; j++) {
            System.out.println("Thread B j: " + j);
            if (j == 2) {
                stop();
            }
            System.out.println("Exit from B");
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 3; k++) {
            System.out.println("Thread C: " + k);
            if (k == 1) {
                try {
                    sleep(1000);
                } catch (Exception e) {
                }
                System.out.println("Exit from C");
            }
        }
    }
}

public class prac7c {
    public static void main(String[] args) {
        System.out.println("Start Thread A");
        new A().start();
        System.out.println("Start Thread B");
        new B().start();
        System.out.println("Start Thread C");
        new C().start();
        System.out.println("Exit main");
    }
}

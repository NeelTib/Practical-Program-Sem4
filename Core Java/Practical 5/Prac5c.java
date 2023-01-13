// Write a java program to implement Multiple inheritance.
interface intf {
    final int num = 12;

    public void displayIntf();
}

class A {
    void displayA() {
        System.out.println("From Class A");
    }
}

class B extends A implements intf {
    void displayB() {
        System.out.println("From Class B");
    }

    public void displayIntf() {
        System.out.println("From Interface, The constant is: " + num);
    }
}

public class Prac5c {
    public static void main(String[] args) {
        B obj = new B();
        obj.displayA();
        obj.displayB();
        obj.displayIntf();
    }
}

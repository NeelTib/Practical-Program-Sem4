// Write a java program to implement sigle level inheritance.
class A {
    void displayA() {
        System.out.println("In class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("In class B");
    }
}

class Prac5a {
    public static void main(String[] args) {
        B obj = new B();
        obj.displayA();
        obj.displayB();
    }
}

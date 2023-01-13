// Write a java program to implement method overriding.

class A {
    void display() {
        System.out.println("In Class A");
    }
}

class B extends A {
    @Override
    void display() {
        System.out.println("In Class B");
        super.display();
    }
}

class prac5b {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.display();

    }
}

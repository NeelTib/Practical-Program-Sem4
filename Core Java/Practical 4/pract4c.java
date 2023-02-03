// Write a program in Java to demonstrate the implementation of abstract class

abstract class pract4c {
    String color = "red";

    public String getColor() {
        return color;
    }
}

class SUV extends pract4c {
    double cc;

    SUV() {
        cc = 1000.0;
    }

    public double cc() {
        return cc;
    }

    public static void main(String[] args) {
        SUV s = new SUV();
        System.out.println(s.cc());
    }
}

// Design a class that demonstrate the use of sonstructor and destructor

class xyz {
    xyz() {
        System.out.println("Constructor method");
    }

    protected void finalize() {
        System.out.println("Garbage collection");
    }
}

class prac4b {
    public static void main(String[] args) {
        xyz ob=new xyz();
        // ob.null;
        System.gc();
    }
}
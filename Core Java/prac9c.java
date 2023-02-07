public class prac9a{
    public static void main(String[] args) {
        try{
            float a=10,b=0,c;
            c=a/b;
            System.out.println("The value of C is: "+c);

        }
        catch(ArithmeticException e){
            System.out.println("Exception Raised: "+e);
        }
    }
}

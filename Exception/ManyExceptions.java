import java.util.*;

public class ManyExceptions{
    public void sayHello(){
        System.out.println("Hello");
    }
    
    public static void main(String[] args){
        try {
            System.out.println("The third argument is "+args[2]);    
        }
        catch (IndexOutOfBoundsException exep)
        {
            System.out.println("Wrong usage! Try Java ManyExceptions <first_argument> <second_argument> <third_argument>");
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = 0;
        try{
            a = sc.nextInt();    
        }
        catch (InputMismatchException e)
        {
            System.out.println("You were supposed to enter an int :)");
        }
        System.out.println("Enter another number");
        int b = 0;
        try{
            b = sc.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("You were supposed to enter an int :)");
        }
        int c = 0;
        try{
            c = a/b;
            System.out.println("The result of the division is "+c);    
        }
        catch (ArithmeticException e)
        {
            System.out.println("Looks like you didn't crunch those numbers right :(");
        }
        try{
            sc.close();
        }
        catch (IllegalStateException e)
        {
            System.out.println("Bad timing sire....");
        }
        int d = 0;
        try{
            d = sc.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("You were supposed to enter an int :)");
        }
        catch (IllegalStateException e)
        {
            System.out.println("You no longer have a scanner ");
        }

        ManyExceptions me = new ManyExceptions();
        me = null;
        try{
            me.sayHello();
        }
        catch (NullPointerException e)
        {
            System.out.println("");
        }
        
        
    }
}
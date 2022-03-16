// Write a function "boolean isEven(number)" to check whether given number is even or not.
public class q2{
    public static void main(String[] args)
    {
        System.out.println(isEven(2));
        System.out.println(isEven(3));
    }
    public static boolean isEven(int n){
        return n%2==0;
    }
}
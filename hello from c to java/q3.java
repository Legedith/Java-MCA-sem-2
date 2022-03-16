// Write a function "boolean isPalindrome(char[] string)" which takes a character array as input and determines whether that represents a palindrome or not. 
import java.util.*;
public class q3{
    public static void main(String[] args)
    {
        // char[] s = {'a','b','c','c','b','a'};
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();              //reads string   
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
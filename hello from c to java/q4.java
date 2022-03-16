import java.util.*;
public class q4{
    public static void main(String[] args)
    {
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements: ");
        n=sc.nextInt();    
        int[] array = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
            array[i]=sc.nextInt();  
        }  
        System.out.print("The mean of the array is: ");
        System.out.println(getMean(array));

    }
// Write a function "float getMean(int[] numbers)" which takes a array of numbers as input and returns its mean. 
    public static float getMean(int[] numbers){
        float mean = 0;
        for(int i=0;i<numbers.length;i++){
            mean += numbers[i];
        }
        mean = mean/numbers.length;
        return mean;
    }
}


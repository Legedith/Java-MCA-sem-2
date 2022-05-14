import java.io.*;
public class SumNumbers {
    public static void main(String[] args)
    {
        try
        {
            DataInputStream ds = new DataInputStream(System.in);
            DataOutputStream dt = new DataOutputStream(System.out);
            String s = "Enter 10 numbers: \n";
            byte[] b = s.getBytes();
            dt.write(b);
            int[] ar = new int[10];
            for(int i=0; i<10; i++)
                ar[i] = Integer.parseInt(ds.readLine());

            int sum = 0;

            s = "\n\nThe numbers are: \n"+sum;
            b = s.getBytes();
            dt.write(b);

            for (int i=0; i<10; i++)
            {
                sum += ar[i];
                dt.flush();
                s = ar[i] + " ";
                b = s.getBytes();
                dt.write(b);
            }
            s = "\nThe sum is \n"+sum;
            b = s.getBytes();
            dt.write(b);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

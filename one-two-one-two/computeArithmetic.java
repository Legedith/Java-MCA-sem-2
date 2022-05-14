import java.io.*;
import java.util.*;

public class computeArithmetic {
    public static void main(String[] args)
    {
        // System.out.println(args.length);
        if (args.length != 1)
        {
            System.out.println("Try passing in the file name :)");
            return;
        }
        File file = new File(".\\" +args[0]+".txt");
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader(file));
            int num_lines = Integer.parseInt(br.readLine());
            
            String st;
            for (int i = 0; i < num_lines; i++)
            {
                st = br.readLine();
                StringTokenizer s = new StringTokenizer(st," "); 
                String token = s.nextToken(); 
                // System.out.println(token);
                // System.out.println(token == "*");
                if (token.equals("+"))
                {
                    float a = Float.parseFloat(s.nextToken());
                    float b = Float.parseFloat(s.nextToken());
                    System.out.println(a+b);
                }
                else if (token.equals("-"))
                {
                    float a = Float.parseFloat(s.nextToken());
                    float b = Float.parseFloat(s.nextToken());
                    System.out.println(a-b);
                }
                else if (token.equals("*"))
                {
                    float a = Float.parseFloat(s.nextToken());
                    float b = Float.parseFloat(s.nextToken());
                    System.out.println(a*b);
                }
                else if (token.equals("/"))
                {
                    float a = Float.parseFloat(s.nextToken());
                    float b = Float.parseFloat(s.nextToken());
                    System.out.println(a/b);
                }
                else{
                    System.out.println("Unidentified delimiter... ");
                }
            }
            
        }
        catch (FileNotFoundException e)
        {
            System.out.println("THe file does not exist.");
        }
        catch (IOException e)
        {
            System.out.println("File can't be read");
        }
    }    
}

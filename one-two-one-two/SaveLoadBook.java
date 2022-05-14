import java.io.*;

public class SaveLoadBook{
    public static void main(String[] args)
    {
        String s = "these violent delights have violent ends";
        Book newBook = new Book(s.split(" "), "Ierene", "Elementary");
        System.out.println("----Original---------");
        System.out.println(newBook);
        System.out.println("---------------------\n\n\n");
        // Serializing
        try{
            FileOutputStream fos = new FileOutputStream(".\\ser\\Book.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(newBook);
            out.close();
            fos.close();
            System.out.println("This book has been serialized and stored inside /ser folder\n\n\n");

        }
        catch (IOException e)
        {
            System.out.println("Hmmmm some issues with file");
            e.printStackTrace();
        }
        
        // Deserializing
        try{
            FileInputStream fileIn = new FileInputStream(".\\ser\\Book.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Book desBook = (Book) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("--------Recovered---------");
            System.out.println(desBook);
            System.out.println("-----------------------------");
        }
        catch (IOException e)
        {
            System.out.println("Somethig wrong with file");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Typecast into a class that actually exists");
        }
        
    }    

}
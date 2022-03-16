import java.util.Scanner;
public class Paranthesis {
   private String opening_brackets = "({[";
   private String closing_brackets = ")}]";

   public boolean isParanthesisMatching(String str){
      // loop over str
      // if opening bracket, push to stack
      // if closing bracket, pop from stack
      Stack stack = new Stack(str.length());
      for(int i = 0; i < str.length(); i++){
         char c = str.charAt(i);
         String s=String.valueOf(c);  //convert char to string
         if(opening_brackets.contains(s)){
            stack.push(c);
         }
         else if(closing_brackets.contains(s)){
            if(stack.isEmpty()){
               return false;
            }
            else{
               char top = stack.pop();
               if(!isMatchingPair(top, c)){
                  return false;
               }
            }
         }
      }
      if (stack.isEmpty()){
         return true;
      }
      else{
         return false;
      }
   }

   public boolean isMatchingPair(char c1, char c2){
      String s1 = String.valueOf(c1);
      String s2 = String.valueOf(c2);
      if(opening_brackets.contains(s1) && closing_brackets.contains(s2)){
         return true;
      }
      else{
         return false;
      }
   }

   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string: ");
      String str = sc.nextLine();
      Paranthesis p = new Paranthesis();
      if(p.isParanthesisMatching(str)){
         System.out.println("The paranthesis are matching");
      }
      else{
         System.out.println("The paranthesis are not matching");
      }
   }
}

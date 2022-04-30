import java.util.*;

class UseStack{

	public static boolean isParanthesisMatching(char[] expr) throws OverFlowException, UnderFlowException{
		int l = expr.length;
		char x = 'a';
		stack ps = new stack(l);

		for(int i = 0; i < l; i++){
				ps.push(expr[i]);
				ps.push(expr[i]);
		}
		for(int i = 0; i < l; i++){
			x = ps.pop();
			x = ps.pop();
		}

		
		return ps.isEmpty;
	}
	
	
	public static void main(String[] args){
		// Input a string as char[] in java
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char[] expr = s.toCharArray();
		try{
			if (isParanthesisMatching(expr)){
				// System.out.println("The string is matching");
			}
			else{
				// System.out.println("The string is not matching");
			}
		}
		catch (UnderFlowException e)
		{
			System.out.println("Exception occured while popping...\n");
			e.printStackTrace();
		}
		catch (OverFlowException e)
		{
			System.out.println("Exception occured while pushing...\n");
			e.printStackTrace();
		}
		
		stack myStack = new stack(1);

		
		try{
			myStack.push('J');
			System.out.println("\nPushed char 'J'");
			myStack.push('D');
			System.out.println("Pushed char 'D'");
		}
		catch (OverFlowException e)
		{
			System.out.println("Exception occured while pushing...\n");
			e.printStackTrace();
		}
		try{
			char ch;
			ch = myStack.pop();
			System.out.println("Popped char "+ch);
			ch = myStack.pop();
			System.out.println("Popped char "+ch);
		
		}
		catch (UnderFlowException e)
		{
			System.out.println("Exception occured while popping...\n");
			e.printStackTrace();
		}



		System.out.println("Program exited gracefully! ");
	}
}

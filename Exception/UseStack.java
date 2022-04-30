import java.util.*;

class UseStack{

	public static boolean isParanthesisMatching(char[] expr){
		int l = expr.length;
		char x = 'a';
		stack ps = new stack(l);
		try{
			for(int i = 0; i < l; i++){
					ps.push(expr[i]);
			}
		}
		catch (OverFlowException e)
		{
			System.out.println("Exception occured while pushing...\n" + e);
			e.printStackTrace();
		}
		try{
			for(int i = 0; i < l; i++){
				x = ps.pop();
			}
		}
		catch (UnderFlowException e)
		{
			System.out.println("Exception occured while popping...\n" + e);
			e.printStackTrace();
		}
		
		return ps.isEmpty;
	}
	
	
	public static void main(String[] args){
		// Input a string as char[] in java
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char[] expr = s.toCharArray();
		if (isParanthesisMatching(expr)){
			System.out.println("The string is matching");
		}
		else{
			System.out.println("The string is not matching");
		}
	}
}

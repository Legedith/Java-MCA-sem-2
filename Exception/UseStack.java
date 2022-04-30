import java.util.*;

class UseStack{

	public static boolean isParanthesisMatching(char[] expr){
		int l = expr.length;
		char x = 'a';
		stack ps = new stack(l);
		for(int i = 0; i < l; i++){
			if(expr[i] == '('){
				ps.push(expr[i]);
			}
			else{
				if(expr[i] == ')'){
					x = ps.pop();
				}
			}
		}
		return ps.isEmpty;
	}
	
	
	public static void main(String[] args){
		
		
	}
}

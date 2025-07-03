package DataStractureBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyStack {
	
	
	public static String reverseString (String str) {
		String [] strArray= str.split("");
		Stack<String> stack = new Stack<>();
		for (String s: strArray) {
			stack.push(s);
		}
		
		List<String> st= new ArrayList<>();
		StringBuffer revs = new StringBuffer();
		//int count=0;
				while(!stack.isEmpty()) {
				//	st.add(stack.pop());
					revs.append(stack.pop());
					//count++;
				}
		return revs.toString();
		
	}

	
	
	public static boolean correctSyntax(String str) {
		String openingBracket ="(<{[";
		String closingBracket =")>}]";
		//String pairBracket="()"
		Stack<String> stack = new Stack<>();

		for (String ch : str.split("")) {
			if (openingBracket.contains(ch)) {
			stack.push(ch);	
			}
			if(closingBracket.contains(ch)) {
				if (stack.isEmpty()) {
					return false;
				}
				String top=stack.pop();
				if((ch==")" && top!="(") ||(ch=="}" && top!="{") ||(ch==">" && top!="<")||(ch=="]" && top!="[")) {
					return false;
				}
				
			}
				
		}
		return stack.isEmpty();
		

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseString("abcde"));
		System.out.println( correctSyntax("<(1+2>)"));
	}

}

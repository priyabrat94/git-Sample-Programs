package StringProgrammings;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsFromSentense {

	
	public static String reverseWord(String sentense) {
		StringBuilder sbr= new StringBuilder();
		String [] str=sentense.split(" ");
		for (var i= str.length-1;i>=0;i--) {
			sbr.append(str[i]+ " ");
		}
		System.out.println(sbr.toString().trim());
		System.out.println("-------------------------------");
		
		String [] str1=sentense.trim().split(" ");
		Collections.reverse(Arrays.asList(str1)); 
		return String.join(" ", str1);// using String.join() and Collections.reverse() method
		
	}
	
	
	public static void main(String[] args) {
 System.out.println(reverseWord("Trees are beautiful"));
	}

}

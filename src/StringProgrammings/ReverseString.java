package StringProgrammings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
	static String s = "";

	public static String reverse(String str) {
		
		if(str==null)
			return "";
//	for (var i= str.length()-1;i>=0;i--) {// fetching values from string from last value, using for loop
//		//s=s+ str.charAt(i);
//		s=s.concat(String.valueOf(str.charAt(i)));
//	}
		for (var i = 0; i <= str.length() - 1; i++) {// fetching values from string from 1st value ,using for loop
			// s= str.charAt(i)+s;
			s = String.valueOf(str.charAt(i)).concat(s);
		}
		
		StringBuilder stb = new StringBuilder();
		stb.append(str);
		stb.reverse();// using StringBuilder reverse method
		System.out.println("stb = " +stb);
		
 		List<String> list = Arrays.asList(str.split(""));// String convert to list
		Collections.reverse(list);// using Collections.reverse() reverse list
		System.out.println(list +"using Collections.reverse() method");
		
		ListIterator<String> itr = list.listIterator();// Iterating list after reverse by Collections.reverse()
		while (itr.hasNext()) {
			System.out.print(itr.next() );
		}
		System.out.println();
		//System.out.println(stb );// using StringBuilder reverse()
		String s2 = Stream.of(str).map(s1 -> new StringBuilder(s1).reverse()).collect(Collectors.joining(""));

		String s3 = Stream.of(str).map(s1 -> new StringBuilder(s1).reverse().toString()).collect(Collectors.toList())
				.get(0);
		System.out.println(s3 + "      using stream");
		// Stream.of(str).map(i->i.length()-1-i).map
//	 String sa="";
//	  sa=sa+i;
//	  System.out.println(sa+"      using stream forEach");
//	  });
		// .collect(Collectors.joining(""));
		return s;
	}

	public static void main(String[] args) {
		System.out.println(reverse("tamiam"));

	}

}

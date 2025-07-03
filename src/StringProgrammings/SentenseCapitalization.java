package StringProgrammings;

import java.util.Arrays;

public class SentenseCapitalization {

	public static void capitalization(String str) {

		StringBuilder bld1 = new StringBuilder();

		String[] st = str.split(" ");
		//System.out.println(Arrays.toString(st));

		for (String s1 : st) {
			char[] st1 = s1.toCharArray();
			bld1.append(" ");
			//System.out.println(s1);
			String s = String.valueOf(s1.charAt(0)).toUpperCase();
 			bld1.append(s);
			for (int i = 1; i < st1.length; i++) {
				bld1.append(st1[i]);
			}

			//System.out.println(bld1);
		}
		String s = new String(bld1);
		System.out.println(s.trim());

	}

	public static void main(String[] args) {
		String s1 = new String("the new value");
		System.out.println(s1);

		capitalization(s1);

	}

}

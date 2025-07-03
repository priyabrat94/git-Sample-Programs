package StringProgrammings;

import java.util.Arrays;
import java.util.Collections;

public class AnagramString {
	// ABCD = CDBA

	public static boolean anagram(String s1, String s2) {

		if(s1==null||s2==null)
			return false;
		String[] c1 = s1.toLowerCase().split("");
		String[] c2 = s2.toLowerCase().split("");

		Collections.sort(Arrays.asList(c1));
		Collections.sort(Arrays.asList(c2));
		//Arrays.sort(c1);

		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));

		return Arrays.equals(c1, c2);

	}

	public static void main(String[] args) {
		System.out.println(anagram("ABCD", "CDBA"));

	}

}

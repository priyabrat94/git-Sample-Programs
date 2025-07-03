package StringProgrammings;

import java.util.Arrays;
import java.util.List;

public class CountVowelsFromString {
static String vowels="aeiou";
static int count=0;
static int count1=0;
	public static int countVowels(String str) {
		if(str==null) 
		return 0;
		for(String st  : str.toLowerCase().split("")) {//converting string to String array
			if(vowels.contains(st)) { 
				count++;
			}
		}
		for(char ch: str.toLowerCase().toCharArray()) {//converting string to lower case then converting to character array
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u' ) {   // not a very good way to write
				//count++;
			}
			if(vowels.contains(Character.toString(ch))) { 
				//count++;
			}
			if(vowels.indexOf(ch)!=-1) { 
				//count++;
			}
		}
		List<String> list= Arrays.asList(str.split(""));
				list.stream().forEach(s->{
					s.toLowerCase();
				if(vowels.contains(s))  
					count1++;
				});
				System.out.println(count1);
		return count;
		
		
	}
	
	public static void main(String[] args) {
		int value = countVowels("abcdefghijk irtdr");
		System.out.println(value);

	}

}

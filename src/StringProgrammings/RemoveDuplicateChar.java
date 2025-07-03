package StringProgrammings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static String removeDuplicate(String str) {
				String[] st = str.split(" ");
				for(var vr: st) {
					System.out.println(vr);
				}
				
		StringBuilder sb= new StringBuilder();		 
		//List<String> list = Arrays.asList(st);
		//Set<String> set = new HashSet<>(list);// wrong process
		Set <Character> ctr= new HashSet<>();
		for(var vt:str.toCharArray()) {
			if(!ctr.contains(vt)) {
				ctr.add(vt);
				
				sb.append(vt);
			}
		}
 		return sb.toString();
	}
	
	public static void main(String[] args) {
 System.out.println(removeDuplicate("trees are"));
	}

}

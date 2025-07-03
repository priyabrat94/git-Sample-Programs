package StringProgrammings.java8;

import java.util.Arrays;
import java.util.List;
import java.util.TooManyListenersException;
import java.util.stream.Collectors;

public class Java8Practice {

	public static void main(String[] args) {

		List<String> list=  Arrays.asList("123","4353","5353");
		
		 list.stream().map(e -> Integer.valueOf(e)).forEach(e-> System.out.println(e));
		 List<Integer> list2 = list.stream().map(e -> Integer.valueOf(e)).collect(Collectors.toList());
		System.out.println(list2);
		System.out.println("-------------------------------------------" );
	}

}

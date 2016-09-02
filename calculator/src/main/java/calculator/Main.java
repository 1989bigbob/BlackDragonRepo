package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		List<Integer> ints = new ArrayList<Integer>();
		
		for(String s : Arrays.asList(args)){
			ints.add(Integer.parseInt(s));
		}
		System.out.println(calc.addInt(ints));

	}

}

package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		List<Integer> ints = new ArrayList<Integer>();
//		
//		for(String s : Arrays.asList(args)){
//			ints.add(Integer.parseInt(s));
//		}
//		System.out.println(calc.addInt(ints));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			String s1 = br.readLine();
			String s2 = br.readLine();
			String s3 = br.readLine();
			
			ints.add(Integer.parseInt(s1));
			ints.add(Integer.parseInt(s2));
			ints.add(Integer.parseInt(s3));
		} catch(NumberFormatException ex){
			ex.printStackTrace();
		} catch(IOException ex){
			ex.printStackTrace();
		}
		
		if(!ints.isEmpty()){
			System.out.println(calc.addInt(ints));
		}
	}

}

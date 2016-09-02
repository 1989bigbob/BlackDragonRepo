package calculator;

import java.util.List;

public class Calculator {
	
	public Calculator(){
		
	}
	
	public int addInt(List<Integer> summands){
		int result = 0;
		for(int summand : summands){
			result += summand;
		}
		return result;
	}

}

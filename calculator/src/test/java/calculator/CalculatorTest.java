package calculator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void TestAdd(){
		Calculator calc = new Calculator();
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(5);
		ints.add(2);
		assertEquals("", 8, calc.addInt(ints));
	}

}

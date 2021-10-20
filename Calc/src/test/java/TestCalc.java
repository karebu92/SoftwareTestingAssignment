
/*
 * 21881 GANZA 			Moses
 * 22047 KAREBU 		Jules
 * 20751 MUDAHERANWA 	Patrick
 * 21936 DUSABIMANA 	Eric
*/


import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.Calculator;

public class TestCalc {

	@Test
	public void add() {
		assertEquals(5, Calculator.addition(3, 2));
	}
	@Test
	public void sub() {
		assertEquals(5, Calculator.substraction(6, 1));
	}
	@Test
	public void mult() {
		assertEquals(6, Calculator.multiplication(3, 2));
	}
	@Test
	public void div() {
		assertEquals(5, Calculator.division(10, 2));
	}

}

/*
 * 21881 GANZA 			Moses
 * 22047 KAREBU 		Jules
 * 20751 MUDAHERANWA 	Patrick
 * 21936 DUSABIMANA 	Eric
*/

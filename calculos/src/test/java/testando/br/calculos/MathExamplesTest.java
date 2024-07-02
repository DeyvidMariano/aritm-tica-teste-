package testando.br.calculos;
import java.math.BigDecimal;
import static org.junit.Assert.*;

import org.junit.Test;

 public class MathExamplesTest {

	@Test
	public void testAdd() {
		assertEquals(8,MathExamples.add(5,3));
	}

	@Test
	public void testSubtract() {
		assertEquals(2,MathExamples.subtract(5,3));
	}

	@Test
	public void testMultiply() {
		assertEquals(15,MathExamples.multiply(5,3));
	}

	@Test
	public void testDivide() {
		assertEquals(4,MathExamples.divide(8,2));
	}

	@Test
	public void testModulo() {
		assertEquals(2,MathExamples.modulo(5,3) );
	}

	@Test
	public void testExponentIntInt() {
		assertEquals(125,MathExamples.exponent(5,3));
		
	}
	@Test
    void testAddDouble() {
        assertEquals(new BigDecimal("8.3"), MathExamples.add(5.2, 3.1));
    }
	
	@Test
	public void testSubtractDouble() {
		assertEquals(125,MathExamples.exponent(5,3));
	}
	/*
	@Test
	public void testDivideDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testExponentDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testSquareRoot() {
		fail("Not yet implemented");
	}

	@Test
	public void testCubeRoot() {
		fail("Not yet implemented");
	}

	@Test
	public void testAbsoluteVal() {
		fail("Not yet implemented");
	}
*/
}

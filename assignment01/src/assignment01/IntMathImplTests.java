package assignment01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.uni_koblenz.ptsd.intmaths.IntMathsImpl;

class IntMathImplTests {

	IntMathsImpl math;
	
	@BeforeEach
	void setUp() {
		math = new IntMathsImpl();
	}
	
	@Test
	void testNormalGCD() {
		assertEquals(3, math.gcd(15, 18));
		assertEquals(5, math.gcd(25, 10));
		assertEquals(15, math.gcd(-45, -15));
		assertEquals(4, math.gcd(-16, 4));
		assertEquals(12, math.gcd(12, -48));
		assertEquals(100, math.gcd(-100, -100));
	}
	
	@Test
	void testOneNullGCD() {
		assertEquals(5, math.gcd(5, 0));
		assertEquals(5, math.gcd(0, 5));
		assertEquals(123, math.gcd(123, 0));
		assertEquals(123, math.gcd(0, 123));
	}
	
	@Test
	void testBothNullGCD() {
	    assertThrows(IllegalArgumentException.class, () -> math.gcd(0, 0));
	}
	
	@Test
	void testEdgeCaseGCD() {
		assertEquals(Integer.MAX_VALUE, math.gcd(Integer.MAX_VALUE, Integer.MAX_VALUE));
	    assertThrows(IllegalArgumentException.class, () -> math.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE));
	}

}

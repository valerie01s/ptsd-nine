package assignment01;

import de.uni_koblenz.ptsd.intmaths.IntMathsImpl;

public class IntMathTesterMain {

	private static IntMathsImpl mathImpl = new IntMathsImpl();
	
	public static void main(String[] args) {
		int a = mathImpl.gcd(5, 15);
		int b = mathImpl.sqrt(16);
		int c = mathImpl.square(5);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

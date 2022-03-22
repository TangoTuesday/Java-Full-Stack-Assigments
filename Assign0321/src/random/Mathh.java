package random;

import java.lang.*;

public class Mathh {

	public static void main(String[] args) {

		double x = 33;
		double y = 44;
		int a = 10;
		int b = 22;

		// returns square root
		System.out.println("Square root of y is " + Math.sqrt(y));

		// returns the smaller variable
		System.out.println("Returns the smaller of the two variables " + Math.min(x, y));

		// returns the multiplication of two numbers
		System.out.println("Multiplies two integers" + Math.multiplyFull(a, b));

		// returns and exponenet e of a
		System.out.println("The exponent of a is " + Math.exp(a));

		// returns the hyberbolic tangent of value of a
		System.out.println("Tangent Value of a is " + Math.tanh(a));

		// returns the trigonometric cosine value of y
		System.out.println("Cosine value of b is " + Math.cos(b));

		// returns the sum of two variables
		System.out.println("Displaying the additon of a and b " + Math.addExact(a, b));

		// Returns the subtraction of two numbers
		System.out.println("Dislaying the subtraction of a from b " + Math.subtractExact(b, a));

		
		
	}

}

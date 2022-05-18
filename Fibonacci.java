package module_2;

/**
 * <h1>Fibonacci</h1> 
 * A program that returns the nth term in the
 * fibonacci sequence and outputs the number.
 *
 * @author Jose Ayala
 * @version 1.0, 05/17/22
 * @since 2022-05-17
 */
public class Fibonacci {

	/**
	 * Main method which launches the application.
	 * @param args The command line arguments.
	 **/
	public static void main(String[] args) {
		
		System.out.println("The nth term of the Fibonacci sequence is: " + getNthFibonacciNumber(10));
	}
	
	/**
	 * A recursive static method that accepts n as a parameter and
	 * returns the nth term in the Fibonacci sequence.
	 * @param nth The term of the Fibonacci sequence.
	 * @return The nth term of the Fibonacci sequence.
	 */
	public static int getNthFibonacciNumber (int nth)
	{		
		if (nth <= 1)
		{
			return nth;
		}
		else
		{
			return nth = getNthFibonacciNumber(nth - 1) + getNthFibonacciNumber(nth - 2);
		}
	}
}

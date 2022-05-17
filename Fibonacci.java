package module_2;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("The nth term of the Fibonacci sequence is: " + getNthFibonacciNumber(10));
	}
	
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

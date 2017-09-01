package edu.usfca.cs.cs245;
public class FactorialRecursive implements Factorial{
	


	@Override
	public int factorial(int n) {
		if( n == 1) {
			return 1;
		}
		return factorial(n-1)*n;

	
	}

}

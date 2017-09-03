package edu.usfca.cs.cs245;
public class FactorialIterative implements Factorial{
	

	@Override
	public int factorial(int n) {
		
		int[] f = new int [n];
		f[0] = 1;
		for(int i = 1; i <= f.length-1; i++) {
			f[i] = f[i-1] *(i+1);
		}
		return f[n-1];

	}
}

package edu.usfca.cs.cs245;

public class FibonacciIteractive implements Fibonacci{
	
	public int fibIl(int n) {
		int[] f = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		for(int i = 2; i <= n; i++) {
			f[i] = f[i-1] + f[i-2];
			
		}
		returen f[n];
	}
	
}

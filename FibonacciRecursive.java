package edu.usfca.cs.cs245;

public class FibonacciRecursive implements Fibonacci{
	public int fibRe(int n) {
		
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		}
		return int result = fibRe(n-1) + fibRe(n -2);
	}

}

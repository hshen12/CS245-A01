package edu.usfca.cs.cs245;
public class FactorialRecursive implements Factorial{
	
	public int facRe(int n) {
		if( n = 1) {
			return 1;
		}
		return facRe(n-1);
	}

}

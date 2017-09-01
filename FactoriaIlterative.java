package edu.usfca.cs.cs245;
public class FactoriaIlterative implements Factorial{
	
	public int facIl(int n) {
		int[] f = new int [n+1];
		f[0] = 1;
		for(int i = 1; i <= n; i++) {
			f[n] = f[n-1] *n;
		}
		return f[n];
	}
}

package org.java.practice.java;

public class PrimeNumber {
	public static boolean isPrimeNumber(int number) {
		if(number<=2) {
			return false;
			}
		for(int i=2;i<number;i++) {
			if((number%i==0)){
				return false;
			}
		}
		return true;
	}	
	public static void primeNumberRange(int from,int upto) {
		for(int i=from;i<=upto;i++) {
			if(isPrimeNumber(i)) {
				//System.out.print(" "+i);
			}
			else {
				System.out.print(" "+i);
			}
		}
	}
	public static void main(String arg[]) {
		//System.out.println(isPrimeNumber(11));
		primeNumberRange(1, 20);
	}
}
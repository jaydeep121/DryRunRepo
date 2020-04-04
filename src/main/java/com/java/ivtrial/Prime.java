package com.java.ivtrial;

public class Prime {
	public static boolean isPrime(int num) {
		if(num<3) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if((num%i==0)) {
				return 	false;
			}
		}
		return true;
	}
	public static void primeNumers(int rangeFrom,int rangeTo) {
		for(int i=rangeFrom;i<=rangeTo;i++) {
			if(isPrime(i)) {
				System.out.println(i+" : is prime number");
			}
			else {
				System.out.println(i+" is not prime number");
			}
		}
	}
	public static void main(String ar[]) {
		//System.out.println(isPrime(1));
		primeNumers(1, 10);
	}

}

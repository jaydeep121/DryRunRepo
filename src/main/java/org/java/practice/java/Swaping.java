package org.java.practice.java;

public class Swaping {
	public void swapNumber(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a-"+a+" b-"+b);
		}
	public void swapNumber() {
		int a=100,b=200,temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a-"+a+" b-"+b);
	}
	public static void main(String arg[]) {
		Swaping s=new Swaping();
		s.swapNumber();
	}
}

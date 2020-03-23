package org.java.practice.java;

public class Reverse {
	
	//The optimized way of reversing.
	public static String reverse(String orig)
	{
	    char[] s = orig.toCharArray();
	    int n = s.length;
	    int halfLength = n / 2;
	    for (int i=0; i<halfLength; i++)
	    {
	        char temp = s[i];
	        s[i] = s[n-1-i];
	        s[n-1-i] = temp;
	    }
	    return new String(s);
	}
	public static String reverseViaLoop() {
		String value="jaydeep";
		String rev="";
		for(int i=value.length()-1;i>=0;i--) {
			rev=rev+value.charAt(i);
		}
		return rev;
	}
	public static String reverseViaFn() {
		String s="jaydeep";
		StringBuffer sb=new StringBuffer(s);
		sb=sb.reverse();
		return sb.toString();	
	}
	public static void reverseNumber() {
		int num=120;
		int temp=num;
		int reverse=0;
		while(num>0) {
			reverse=(reverse*10);
			reverse=reverse+(num%10);
			num=num/10;
		}
		System.out.println(temp+"-----"+reverse);
	}
	public static void main(String args[]) {
		reverseNumber();
	}
}

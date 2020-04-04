package com.java.ivtrial;

import org.testng.xml.ISuiteParser;

public class Reverse {
	public static void reverseNumber(int num) {
		int temp=num;
		int reverse=0;
		int reminder=0;
		while(num>0) {
			reminder=(num%10);
			reverse=(reverse*10)+reminder;
			num=num/10;
		}
		System.out.println("reverse number is "+reverse);
	}
	public static void isPalindrome(int num) {
		int temp=num;
		int reverse=0;
		int reminder=0;
		while(num>=1) {
			reminder=(num%10);
			reverse=(reverse*10)+reminder;
			num=(num/10);
		}
		if(reverse==temp)
			System.out.println("number is palindrome : "+reverse);
		else
			System.out.println("number is not palindrome : "+reverse);
	}
	public static void isRightSideLeftSide(int right,int left) {
		String rightSide=String.valueOf(right);
		String leftSide=String.valueOf(left);
		int rightSideLen=(rightSide.length()/2);
		int leftSideLen=(leftSide.length()/2);
		int lhs=0;
		int rhs=0;
		for(int i=0;i<rightSideLen;i++) {
			lhs=lhs+Integer.parseInt(rightSide.substring(i,i+1));
			rhs=rhs+Integer.parseInt(leftSide.substring(i,i+1));
		}
		if(lhs==rhs) {
			System.out.println("both side is equal ");
		}
		else {
			System.out.println("both side is not equal ");
		}
		System.out.println("lhs is- "+lhs+"  rhs is- "+rhs);
		
	}
	public static void main(String arh[]) {
		//reverseNumber(123);
		//isPalindrome(121);
		isRightSideLeftSide(1234567, 654798615);
	}

}

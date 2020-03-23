package org.java.practice.java;

public class StringManipulation {
	public static void stringManipulate(String str) {
		str=str.toLowerCase();
		String number="";
		String ch="";
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>='a' && str.charAt(i)<='z')) {
				ch=ch+str.charAt(i);
			}
		}
		//number=str.replaceAll("[^0-9]+", " ");
		number=str.replaceAll("[^0-9]+", " ").replaceAll(" ", ""); //to removing space
		System.out.println(ch+" "+number);
	}
	public static void getSubstring() {
		String s="jaydeep ku";
		System.out.println(s.indexOf('z'));
		System.out.println(s.indexOf("jaydeep"));
		System.out.println(s.substring(0,10));
	}
	public static void main(String arg[]) {
		//stringManipulate("ja23deep7");
		getSubstring();
	}

}

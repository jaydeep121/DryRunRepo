package com.java.ivtrial;

public class StringManipulation {
	public static void setString(String value,int from,int to) {
		String newValue=value.substring(from,to);
		System.out.println(newValue);
	}
	
	public static void main(String arg[]) {
		String text="jaydeep";
		setString(text, 0, text.length());
	}

}

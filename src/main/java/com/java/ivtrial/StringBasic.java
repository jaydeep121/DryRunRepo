package com.java.ivtrial;

public class StringBasic {
	public static String helloName(String name) {
		return "HELLO "+name; 
	}
	public static String makehaba(String firstName,String secondName) {
		return firstName+secondName+secondName+firstName;
	}
	public static String makeTag(String tag,String name) {
		return "<"+tag+">"+name+"</"+tag+">";
	}
	public static String makeOutWord(String out,String name) {
		return out.substring(0,out.length()/2)+name+out.substring(out.length()/2);
	}
	public static String exractEnd(String text) {
		text=text.substring(text.length()-2);
		return text+text+text;
	}
	public static String firstTwo(String text) {
		text=text.substring(0,2);
		return text;
	}
	public static String firstHalf(String text) {
		text=text.substring(0,(text.length()/2));
		return text;
	}
	public static String withoutEnd(String text) {
		text=text.substring(1,text.length()-1);
		return text;
	}
	public static String comboString(String a,String b) {
		int lenA=a.length();
		int lenB=b.length();
		if(lenA<lenB) {
			return a+b+a;
		}
		else {
			return b+a+b;
		}
	}
	public static String nonStart(String a,String b) {
		return a.substring(1)+b.substring(1);
	}
	public static String left2(String text) {
		text=text.substring(2)+text.substring(0,2);
		return text;
	}
	public static String right2(String text) {
		text=text.substring(text.length()-2)+text.substring(0,text.length()-2);
		return text;
	}
	public static String theEnd(String str, boolean front) {
		  if(front==true) {
			  return str.substring(0,1);
		  }
		  else {
			  return str.substring(str.length()-1);
		  }
	}

	public static void main(String sr[]) {
		String text="shotl";
		String alternateNmae="Hello";
		System.out.println(theEnd(alternateNmae,false));
	}

}

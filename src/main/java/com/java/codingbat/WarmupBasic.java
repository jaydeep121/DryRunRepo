package com.java.codingbat;

public class WarmupBasic {
	public static void main(String ar[]) {
		System.out.println(everyNth("abcdefg",3));
	}
	public static String everyNth(String str, int n) {
		  String result="";
		  for(int i=0;i<str.length();i=i+n) {
			  result=result+str.charAt(i);
		  }
		  return result;
	}
	public static String endUp(String str) {
		 if(str.length()<3) {
			 return str.toUpperCase();
		 } 
		 else {
			 return str.substring(0,str.length()-3)+str.substring(str.length()-3).toUpperCase();
		 }
	}

	public static boolean lastDigit(int a, int b) {
		  a=a%10;
		  b=b%10;
		  return (a==b);
	}

	public static boolean stringE(String str) {
		  int count=0;
		  /*for(int i=0;i<str.length();i++) {
			  if(str.charAt(i)=='e') {
				  count++;
			  }
		  }*/
		  for(int i=0;i<str.length();i++) {
			  if(str.substring(i,i+1).equals("e")) {
				  count++;
			  }
		  }
		  return (count>=1 && count<=3);
	}

	public static int max1020(int a, int b) {
		  int max;
		  if((a>=10 && a<=20 && b>=10 && b<=20)) {
			  max=Math.max(a, b);
			  return max;
		  }
		  else {
			  return 0;
		  }
	}
	public static boolean in3050(int a, int b) {
		  return ((a>=30 && a<=40 && b>=30 && b<=40) || (a>=40 && a<=50 && b>=40 && b<=50));
	}
	public static int close10(int a, int b) {
		  int aDiff=Math.abs(10-a);
		  int bDiff=Math.abs(10-b);
		  if(aDiff<bDiff) {
			  return a;
		  }
		  else if(aDiff>bDiff) {
			  return b;
		  }
		  else {
			  return 0;
		  }
	}
	public static int intMax(int a, int b, int c) {
		/*  int max;
		  if(a>b) {
			  max=a;
		  }
		  else {
			  max=b;
		  }
		  if(c>max) {
			  max=c;
		  }
		  return max;*/
		int max;
		max=Math.max(a, b);
		return Math.max(c,max);
	}

	public static String startOz(String str) {
		  String result="";
		  if(str.length()>=1 && str.charAt(0)=='o') {
			  result=result+str.charAt(0);
		  }
		  if(str.length()>=2 && str.charAt(1)=='z') {
			  result=result+str.charAt(1);
		  }
		  return result;
	}

	public static boolean mixStart(String str) {
		  return (str.length()>3 && str.substring(1,3).equals("ix"));
	}
	public static String delDel(String str) {
		  String delDel=null;
		  if(str.substring(1,4).equals("del")) {
			  delDel=str.substring(0,1)+str.substring(4);
		  }
		  else {
			  delDel=str;
		  }
		  return delDel;
	}
	public static boolean loneTeen(int a, int b) {
		  boolean aTeen=(a>=13 && a<=19);
		  boolean bTeen=(b>=13 && b<=19);
		  return ((aTeen && !bTeen) || (!aTeen && bTeen));
	}

	public static boolean hasTeen(int a, int b, int c) {
		 return ((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)); 
	}

	public static boolean in1020(int a, int b) {
		  return ((a>=10 && a<=20) || (b>=10 && b<=20));
	}

	public static boolean icyHot(int a, int b) {
		 return((a<0 && b>100) || (a>100 && b<0));
	}

	public static boolean startHi(String str) {
		  return (str.substring(0,2).toLowerCase().equals("hi"));
	}

	public static String front22(String str) {
		  String front=null;
		  if(str.length()<2) {
			  front=str;
		  }
		  else {
			  front=str.substring(0,2);
		  }
		  return front+str+front;
	}
	public static boolean or35(int n) {
		  return (n%3==0 || n%5==0);
	}

	public static String backAround(String str) {
		  String lastChar=str.substring(str.length()-1);
		  return lastChar+str+lastChar;
	}
	public static String front3(String str) {
		  String front=null;
		  if(str.length()>3) {
			  front=str.substring(0,3);
		  }
		  else {
			  front=str;
		  }
		  return front+front+front;  
	}
	public static String frontBack(String str) {
		if(str.length()<=1) {
			return str;
		}
		else {
			String front=str.substring(str.length()-1);
			  String mid=str.substring(1,str.length()-1);
			  String back=str.substring(0,1);
			  return front+mid+back;
		}
	}
	public static String missingChar(String str, int n) {
		/*  String newStr="";
		  for(int i=0;i<str.length();i++) {
			  if(i!=n) {
				  newStr=newStr+str.charAt(i);
			  }
		  }
		  return newStr;*/
		String firstHalf=str.substring(0,n);
		String lastHalf=str.substring(n+1,str.length());
		return firstHalf+lastHalf;
	}
	public static String notString(String str) {
		boolean isNot=str.substring(0,3).toLowerCase().equals("not");
		  if(!isNot) {
			  return "not " +str;
		  }
		  else {
			  return str;
		  }
	}

	public static boolean posNeg(int a, int b, boolean negative) {
		//  return ((!negative && ( (a<0 && b>=0) || (a>=0 && b<0))) || (negative && a<0 && b<0));
		if(negative) {
			return (a<0 && b<0);
		}
		else {
			return ( (a<0 && b>=0) || (a>=0 && b<0));
		}
	}

	public static boolean nearHundred(int n) {
		  int near100=Math.abs(n+10);
		  int near200=Math.abs(n+10);
		  return ((near100>=100 || near200>=200));
	}

	public static  boolean makes10(int a, int b) {
		  int sum=a+b;
		  return ((a==10 || b==10 || sum==10));
	}

	public static boolean parrotTrouble(boolean talking, int hour) {
		  return (talking && (hour<7 || hour>=20 ));
	}

	public static int dif21(int n) {
	/*	int absaluteDiff=Math.abs(21-n);
		return absaluteDiff;
	}*/
		if(n<=21) {
			return (21-n);
			}
		else {
			return (n-21);
		}
		}
	public static int sumDouble(int a, int b) {
		int sum=a+b;
		  if(a==b) {
			  return (2*sum);
		  }
		  else {
			  return sum;
		  }
	}
	public static boolean monkeySmiling(boolean aSmile,boolean bSmile) {
		return ((!aSmile && !bSmile) || (aSmile && bSmile));
	}
	public static boolean sleepIn(boolean weekday,boolean vocation) {
		return (!weekday || vocation);
	} 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           } 



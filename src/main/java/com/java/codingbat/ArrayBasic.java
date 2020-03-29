package com.java.codingbat;

public class ArrayBasic {
	public static void main(String[] args) {
		int arr[]= {61,1, 2, 61};
		//System.out.println(sameFirstLast(arr));
		int ar[]=makePi();
		for(int i:ar) {
			System.out.println(i);
		}
	}
	public static int[] makePi() {
		  int a[]=new int[3];
		  a[0]=1;
		  a[1]=2;
		  a[2]=3;
		  return a;

	}
	public static boolean sameFirstLast(int[] nums) {
		  return(nums[0]==nums[nums.length-1]);
	}

	public static boolean firstLast6(int[] nums) {
		  return(nums[0]==6 || nums[nums.length-1]==6);
	}


}

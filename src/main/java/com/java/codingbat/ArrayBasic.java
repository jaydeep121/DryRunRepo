package com.java.codingbat;

public class ArrayBasic {
	public static void main(String[] args) {
		int arr[]= {100,2};
		int b[]={8,9};
		//System.out.println(start1(arr,b));
		int ip[]=biggerTwo(arr,b);
		for(int n:ip) {
			System.out.println(n);
		}
	}
	public static int[] biggerTwo(int[] a, int[] b) {
//		if((a[0]+a[1]>b[0]+b[1])) {
//			return a;
//		}
//		return b;
		//or
		int sum=(a[0]+a[1])-(b[0]-b[1]);
		if(sum>=0) {
			return a;
		}
		else {
			return b;
		}
	}

	public static int start1(int[] a, int[] b) {
		  int oneCount=0;
		  if(a.length>=1 && a[0]==1) {
			  oneCount+=1;
		  }
		  if(b.length>=1 && b[0]==1) {
			  oneCount+=1;
		  }
		  return oneCount;
	}

	public static int[] fix23(int[] nums) {

		int[] fxArr = {nums[0], nums[1], nums[2]};
		if(nums[0] == 2 && nums[1] == 3)
				fxArr[1] = 0;
		if(nums[1] == 2 && nums[2] == 3)
				fxArr[2] = 0;
		return fxArr;	
	}
	public static int[] makeLast(int[] nums) {
		  int doubleArr[]=new int[nums.length*2];
		  doubleArr[doubleArr.length-1]=nums[nums.length-1];
		  return doubleArr;
	}

	public static boolean no23(int[] nums) {
		if((nums[0]==2||nums[0]==3)) {
			return false;
		}
		else {
			return (!(nums[1]==2||nums[1]==3));
		} 
	}
	public static boolean has23(int[] nums) {
		if(nums[0]==2||nums[0]==3) {
			return true;
		}
		else {
			return (nums[1]==2||nums[1]==3);
		}
	}

	public static int[] makeEnds(int[] nums) {
		 int newArr[]= {nums[0],nums[nums.length-1]};
		 return newArr;
	}

	public static int[] middleWay(int[] a, int[] b) {
		  int mid[]= {a[1],b[1]};
		  return mid;
	}

	public static int sum2(int[] nums) {
		  if(nums.length>=2) {
			  return nums[0]+nums[1];
		  }
		  else if(nums.length==1) {
			  return nums[0];
		  }
		  return 0;
	}
	public static int[] maxEnd3(int[] nums) {
		  int largest[]=new int[3];
		  largest[0]=nums[0];
		  if(largest[0]>nums[2]) {
			  largest[0]=nums[0];
		  }
		  else {
			  largest[0]=nums[2];
		  }
		  largest[1]=largest[0];
		  largest[2]=largest[0];
		  return largest;
	}

	public static int[] reverse3(int[] nums) {
		  int reverse[]= {nums[2],nums[1],nums[0]};
		  return reverse;
	}

	public static int[] rotateLeft3(int[] nums) {
		int rotate[]= {nums[1],nums[2],nums[0]};
		  return rotate;
	}

	public static int sum3(int[] nums) {
		return nums[0]+nums[1]+nums[2];
	}
	public static boolean commonEnd(int[] a, int[] b) {
		  return(a[0]==b[0] ||a[a.length-1]==b[b.length-1]);
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
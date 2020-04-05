package com.java.codingbat;

public class ArrayBasic {
	public static void main(String[] args) {
		int arr[]= {};
		int b[]={2,5};
		//System.out.println(frontPiece(arr));
		int ip[]=front11(arr,b);
		for(int n:ip) {
			System.out.println(n);
		}
	}
	public static int[] front11(int[] a, int[] b) {
		  int arr[]=new int[2];
		  if(a.length<1) {
			  arr[0]=b[0];
			  arr[1]=b[1];
		  }
		  else if(b.length<1) {
			  arr[0]=a[0];
			  arr[1]=a[1];
		  }
		  else {
			  arr[0]=a[0];
			  arr[1]=b[0];
			  }
		  return arr;
	}
	public static int[] make2(int[] a, int[] b) {
		  int lenA=a.length;
		  int make[]=new int[2];
		  if(lenA>=2) {
			  make[0]=a[0];
			  make[1]=a[1];
		  }
		  else if(lenA==1) {
			  make[0]=a[0];
			  make[1]=b[0];
		  }
		  else {
			  make[0]=b[0];
			  make[1]=b[1];
		  }
		  return make;
	}

	public boolean unlucky1(int[] nums)
	{
		int lastP = nums.length-1;
		if(lastP  >= 2)
		{
			if((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3))
				return true;
			return (nums[lastP-1] == 1 && nums[lastP] == 3);
		}
		if(lastP  == 1)
			return ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3));
		return false;
	}
	public static int[] frontPiece(int[] nums) {
		  if(nums.length>=2) {
			  int a[]= {nums[0],nums[1]};
			  return a;
		  }
		  else {
			  return nums;
		  }
	}

	public static int maxTriple(int[] nums) {
		  int largest=nums[0];
		  if(largest<nums[nums.length/2]) {
			  largest=nums[nums.length/2];
		  }
		  if(largest<nums[nums.length-1]) {
			  largest=nums[nums.length-1];
		  }
		  return largest;
	}

	public static int[] midThree(int[] nums) {
		  int mid=nums.length/2;
		  int arr[]= {nums[mid-1],nums[mid],nums[mid+1]};
		  return arr;
	}

	public static int[] swapEnds(int[] nums) {
		  int temp=nums[0];
		  nums[0]=nums[nums.length-1];
		  nums[nums.length-1]=temp;
		  return nums;
	}

	public static int[] plusTwo(int[] a, int[] b) {
		  int plusarr[]= {a[0],a[1],b[0],b[1]};
		  return plusarr;
	}

	public static int[] makeMiddle(int[] nums) {
		  int ar[]= {nums[(nums.length/2)-1],nums[(nums.length/2)]};
		  return ar;
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
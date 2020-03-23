package com.java.iqadvance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectionTest {
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	
	@Test
	public void sumTest() {
		ExpectionTest obj=new ExpectionTest();
		int s=obj.add(1, 2);
		//Assert.assertEquals(s, 3,"test fail");
		try {
			int a=5/0;
		}
	
		catch(ArithmeticException e) {
			System.out.println("test........."+e);
		}
		catch(NullPointerException e) {
			System.out.println("test........."+e);
		}
		catch(Exception e) {
			System.out.println("test........."+e);
		}
	}
}

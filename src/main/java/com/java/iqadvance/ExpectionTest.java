package com.java.iqadvance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectionTest {
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public int sum() {
		System.out.println(" block ");
		try {
			return 1;
		}
			catch(ArithmeticException e) {
				return 2;
			}
		finally {
			System.out.println("finnally block ");
		}
	}
	@Test
	public void get() {
		ExpectionTest e=new ExpectionTest();
		System.out.println(e.sum());
	}
	@Test(enabled=false)
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

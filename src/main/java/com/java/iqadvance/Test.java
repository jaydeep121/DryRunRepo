package com.java.iqadvance;

import org.openqa.selenium.WebDriver;

public class Test  {
	public static void main(String arg[]) {
		SingleTonClass s=SingleTonClass.getInstance();
		SingleTonClass t=SingleTonClass.getInstance();
		SingleTonClass v=SingleTonClass.getInstance();
		System.out.println(s.hashCode()+"\t"+t+"\t"+v);
		
	}
	public static class innerClass {
		public innerClass() {
			
		}
		
	}
		
	}
	

package com.java.iqadvance;

public class SingleTonClass {
	
	private static SingleTonClass instance=null;
	
	private SingleTonClass() {
		System.out.println("cons1");
	}
	public static SingleTonClass getInstance() {
		if(instance==null) {
			instance=new SingleTonClass();
		}
		return instance;
	}
	
	



}

package com.java.inheritcace;

public class Car extends Vehicle{
	public int speed=80;
	public static String model="ja12";
	public void speedRange() {
		System.out.println("speed of the car is "+speed);
		System.out.println("speed of the vehicle is "+super.speed);
	}
	public void print() {
		System.out.println("model of the car is "+this.model);
		System.out.println("speed of the vehicle is "+super.model);
	}
	

}

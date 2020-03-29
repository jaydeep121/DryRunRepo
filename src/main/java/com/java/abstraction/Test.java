package com.java.abstraction;

public class Test {
	public static void main(String[] args) {
		Employee cont=new Contractor("jaydeep", 500, 8);
		System.out.println(cont.getName()+" "+cont.calculateSalary()+" "+cont.getPaymentPerHour());
		Employee full=new FullTimeEmployee("Anuj", 600);
		System.out.println(full.getName()+" "+full.calculateSalary());
	}

}

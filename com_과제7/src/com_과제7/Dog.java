package com_과제7;

public class Dog {
	private String name;
	public static String breed;
	private int age;
	
	public  Dog(String n,int a) {
		name = n;
		age = a;
	
	}
	public Dog(String n,String b,int a) {
		name = n;
		breed = b;
		age = a;
	}
	
	public void print() {
		System.out.println("이름:"+name);
		System.out.println("종류:"+breed);
		System.out.println("나이:"+age);
	}
}

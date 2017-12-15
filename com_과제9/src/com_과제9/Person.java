package com_°úÁ¦9;

public class Person {

	public String name;
	public String address;
	public String number;
	
	public Person (String n,String a,String nu) {
		name = n;
		address = a;
		number = nu;
	}

	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String a) {
		address = a;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String nu) {
		number = nu;
	}
}
	class Customer extends Person {
		
		public int customern;
		public int mileage;
		
		public Customer(String n,String a,String nu,int cn,int m) {
			super(n,a,nu);
			customern = cn;
			mileage = m;
		}
		public int setCustomern() {
			return customern;
		}
		public void getCustomern(int cn) {
			customern = cn;	
		}
		public int setMileage() {
			return mileage;
		}
		public void getMileage(int m) {
			mileage = m;
		}
		
	}
 
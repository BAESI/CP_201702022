package com_과제9;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("배시현","472-9","01068863487");
		Customer c1 = new Customer("서주연","기숙사7동","01042899741",12,50);
		
		System.out.println(p1.name+"의 정보\n집주소:"+p1.address+"   전화번호:"+p1.number);
		System.out.println(c1.name+"의 정보\n집주소:"+c1.address+"   전화번호:"+c1.number + "   고객번호:" + c1.customern + "   마일리지:" + c1.mileage);
	}

}

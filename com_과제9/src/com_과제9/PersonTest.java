package com_����9;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("�����","472-9","01068863487");
		Customer c1 = new Customer("���ֿ�","�����7��","01042899741",12,50);
		
		System.out.println(p1.name+"�� ����\n���ּ�:"+p1.address+"   ��ȭ��ȣ:"+p1.number);
		System.out.println(c1.name+"�� ����\n���ּ�:"+c1.address+"   ��ȭ��ȣ:"+c1.number + "   ����ȣ:" + c1.customern + "   ���ϸ���:" + c1.mileage);
	}

}

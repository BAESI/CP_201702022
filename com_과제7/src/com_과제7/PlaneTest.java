package com_����7;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		p1.setpruducer("�������");
		p1.setmodel("A380");
		p1.setmaxpassenger(500);
		p2.setpruducer("SAMSUNG");
		p2.setmodel("galuxy");
		p2.setmaxpassenger(400);
		System.out.println(p1.getmodel() + "�� ���ۻ�� ž���ο�:" + p1.getpruducer() + "," + p1.getmaxpassenger());
		System.out.println(p2.getmodel() + "�� ���ۻ�� ž���ο�:" + p2.getpruducer() + "," + p2.getmaxpassenger());
		int n = Plane.getnumberofplanes();
		System.out.println("������ ������� ����:" + n);
	}

}

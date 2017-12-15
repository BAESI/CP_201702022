package com_과제7;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		p1.setpruducer("에어버스");
		p1.setmodel("A380");
		p1.setmaxpassenger(500);
		p2.setpruducer("SAMSUNG");
		p2.setmodel("galuxy");
		p2.setmaxpassenger(400);
		System.out.println(p1.getmodel() + "의 제작사와 탑승인원:" + p1.getpruducer() + "," + p1.getmaxpassenger());
		System.out.println(p2.getmodel() + "의 제작사와 탑승인원:" + p2.getpruducer() + "," + p2.getmaxpassenger());
		int n = Plane.getnumberofplanes();
		System.out.println("생성된 비행기의 갯수:" + n);
	}

}

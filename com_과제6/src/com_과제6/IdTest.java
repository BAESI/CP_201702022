package com_����6;
	import java.util.Scanner;
public class IdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Id id = new Id();
		String A;
		String B;
		String C;
		String D;
		System.out.print("<��������>\n���̵� �Է��Ͻÿ�:");
		A = input.next();
		System.out.print("��й�ȣ�� �Է��Ͻÿ�:");
		B = input.next();
		id.setid(A);
		id.setpassword(B);
		System.out.print("\n<�α���>\nID:");
		C = input.next();
		System.out.print("PW:");
		D = input.next();
		id.setlid(C);
		id.setlpassword(D);
		id.login();
		
	}

}

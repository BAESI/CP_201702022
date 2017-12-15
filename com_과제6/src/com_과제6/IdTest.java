package com_과제6;
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
		System.out.print("<계정생성>\n아이디를 입력하시오:");
		A = input.next();
		System.out.print("비밀번호를 입력하시오:");
		B = input.next();
		id.setid(A);
		id.setpassword(B);
		System.out.print("\n<로그인>\nID:");
		C = input.next();
		System.out.print("PW:");
		D = input.next();
		id.setlid(C);
		id.setlpassword(D);
		id.login();
		
	}

}

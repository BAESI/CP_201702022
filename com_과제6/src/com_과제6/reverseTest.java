package com_과제6;
	import java.util.Scanner;
public class reverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		reverse nr = new reverse();
		
		String texta;
		
		System.out.print("문자열을 입력하시오.");
		texta = input.next();
		
		nr.reverse(texta);
		
		
	}

}

package com_����8;
	import java.util.Scanner;
public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int Seat;
		int[] check = {0,0,0,0,0,1,1,1,0,0};
		int book;
		while (true) {
		System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
		Seat = input.nextInt();
		if (Seat == 1) {
			System.out.println("���� ������´� ������ �����ϴ�.\n -------------------- \n 1 2 3 4 5 6 7 8 9 10 \n -------------------- " );
			 for (int i = 0; i <= 9; i++ ) {
				 System.out.print(" "+check[i]);
			 } 
			 System.out.print("\n���° �ڼ��� �����Ͻðڽ��ϱ�?");
			 book = input.nextInt();
			 if ( check[book-1] == 0) {
				 check[book-1] = 1;
				 System.out.println("����Ǿ����ϴ�.");
			 }
			 else	System.out.println("�̹� ����� �¼��Գ���.");

		}
		else if ( Seat == 0){
			break;
	    }
	  }
	}

}
   
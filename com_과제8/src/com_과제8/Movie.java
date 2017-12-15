package com_과제8;
	import java.util.Scanner;
public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int Seat;
		int[] check = {0,0,0,0,0,1,1,1,0,0};
		int book;
		while (true) {
		System.out.print("좌석을 예약하시겠습니까?(1 또는 0)");
		Seat = input.nextInt();
		if (Seat == 1) {
			System.out.println("현재 예약상태는 다음과 같습니다.\n -------------------- \n 1 2 3 4 5 6 7 8 9 10 \n -------------------- " );
			 for (int i = 0; i <= 9; i++ ) {
				 System.out.print(" "+check[i]);
			 } 
			 System.out.print("\n몇번째 자석을 예약하시겠습니까?");
			 book = input.nextInt();
			 if ( check[book-1] == 0) {
				 check[book-1] = 1;
				 System.out.println("에약되었습니다.");
			 }
			 else	System.out.println("이미 예약된 좌석입나다.");

		}
		else if ( Seat == 0){
			break;
	    }
	  }
	}

}
   
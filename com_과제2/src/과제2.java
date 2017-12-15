	import java.util.Scanner;
public class 과제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pyung;
		double m;
		System.out.print("평방 미터로 환산 할 평수을 입력하시오.");
		pyung = input.nextInt();
		m = pyung*(3.3058);
		System.out.println("환산 된 평방 미터는" + m + "m2 입니다.");
	}

}

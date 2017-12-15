		import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double F;
		System.out.print("화씨온도(F)를 입력하시오 :");
		F = input.nextDouble();
		double C;
//		C =5/9*(F-32);
		C = (F-32)*5/9;
		System.out.println("입력된 화씨온도랑 동일한 섭씨온도는 " + C + "입니다");
		
	}

}

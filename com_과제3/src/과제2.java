	import java.util.Scanner;
public class 과제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	double height;
	double weight;
	double Oweight;
	System.out.print("키를 입력하시오.");
	height = input.nextDouble();
	System.out.print("몸무게를 입력하시오.");
	weight = input.nextDouble();
	Oweight = (height-100)*(0.9);
	if ( weight >= Oweight+(Oweight*(0.1)) ) {
		System.out.println("과체중입니다.");
	}
	else if ( weight <= Oweight-(Oweight*(0.1))) {
		System.out.println("저체중입니다.");
	}
	else 
		System.out.println("정상입니다.");
	}

}
	
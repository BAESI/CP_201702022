	import java.util.Scanner;
public class 과제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int mile;
		System.out.print("마일을 입력하시오:");
		mile = input.nextInt();
		double kilometer;
		kilometer = mile*(1.609);
		System.out.println(mile + "마일은" + kilometer +"입니다.");
	}

}

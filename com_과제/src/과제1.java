	import java.util.Scanner;
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int mile;
		System.out.print("������ �Է��Ͻÿ�:");
		mile = input.nextInt();
		double kilometer;
		kilometer = mile*(1.609);
		System.out.println(mile + "������" + kilometer +"�Դϴ�.");
	}

}

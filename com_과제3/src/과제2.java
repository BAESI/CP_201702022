	import java.util.Scanner;
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	double height;
	double weight;
	double Oweight;
	System.out.print("Ű�� �Է��Ͻÿ�.");
	height = input.nextDouble();
	System.out.print("�����Ը� �Է��Ͻÿ�.");
	weight = input.nextDouble();
	Oweight = (height-100)*(0.9);
	if ( weight >= Oweight+(Oweight*(0.1)) ) {
		System.out.println("��ü���Դϴ�.");
	}
	else if ( weight <= Oweight-(Oweight*(0.1))) {
		System.out.println("��ü���Դϴ�.");
	}
	else 
		System.out.println("�����Դϴ�.");
	}

}
	
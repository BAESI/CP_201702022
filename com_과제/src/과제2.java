		import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double F;
		System.out.print("ȭ���µ�(F)�� �Է��Ͻÿ� :");
		F = input.nextDouble();
		double C;
//		C =5/9*(F-32);
		C = (F-32)*5/9;
		System.out.println("�Էµ� ȭ���µ��� ������ �����µ��� " + C + "�Դϴ�");
		
	}

}

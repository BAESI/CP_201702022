		import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int r;
		int h;
		double v;
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�:");
		r = input.nextInt();
		System.out.print("������� ���̸� �Է��Ͻÿ�:");
		h = input.nextInt();
		v = (Math.PI*Math.pow(r, 2))*h;
		System.out.println("������� ���Ǵ�" + v + "�Դϴ�.");
		
	}

}

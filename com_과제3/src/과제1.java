import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b, c;
		Scanner input = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		b = input.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		c = input.nextInt();
		System.out.print("���ĵ� ����: ");
		if (a > b) {
			if (b > c) {
				
				System.out.println(c + " " + b + " " + a);
			} 
			else {
				if (a > c) {
					System.out.println(b + " " + c + " " + a);
				} else {
					System.out.println(b + " " + a + " " + c);
				}
			}
		} 
		else {
			if (a > c) {
				System.out.println(c + " " + a + " " + b);
			} else {
				if (b > c) {
					System.out.println(a + " " + c + " " + b);
				} 
				else {
					System.out.println(a + " " + b + " " + c);
				}

			}

		}

	}

}

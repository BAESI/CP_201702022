		import java.util.Scanner;

public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cm;
		System.out.print("Ű�� �Է��Ͻÿ�:");
		cm = input.nextInt();
		int feet;
		feet = (int) ((cm/2.54)/12);
		double inch;
		inch = (cm/2.54)-(12*feet);
		System.out.println(cm + "cm�� " + feet + "��Ʈ" + inch + "��ġ�Դϴ�." );
		
	}

}

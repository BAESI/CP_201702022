		import java.util.Scanner;

public class 과제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cm;
		System.out.print("키를 입력하시오:");
		cm = input.nextInt();
		int feet;
		feet = (int) ((cm/2.54)/12);
		double inch;
		inch = (cm/2.54)-(12*feet);
		System.out.println(cm + "cm는 " + feet + "피트" + inch + "인치입니다." );
		
	}

}

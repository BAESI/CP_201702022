
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Em1 = new Employee();
		Employee Em2 = new Employee();
		
		Em1.setname("�����");
		Em1.setnumber("01068863487");
		Em1.setpay(300000000);
		Em2.setname("������");
		Em2.setnumber("01052545955");
		Em2.setpay(50000000);
		System.out.println("�̸�,��ȭ��ȣ,���� :" + Em1.getname() +","+ Em1.getnumber() + "," + Em1.getpay());
		System.out.println("�̸�,��ȭ��ȣ,���� :" + Em2.getname() +","+ Em2.getnumber() + "," + Em2.getpay());
	}

}

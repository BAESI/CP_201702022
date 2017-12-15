
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Em1 = new Employee();
		Employee Em2 = new Employee();
		
		Em1.setname("배시현");
		Em1.setnumber("01068863487");
		Em1.setpay(300000000);
		Em2.setname("이의재");
		Em2.setnumber("01052545955");
		Em2.setpay(50000000);
		System.out.println("이름,전화번호,연볼 :" + Em1.getname() +","+ Em1.getnumber() + "," + Em1.getpay());
		System.out.println("이름,전화번호,연볼 :" + Em2.getname() +","+ Em2.getnumber() + "," + Em2.getpay());
	}

}

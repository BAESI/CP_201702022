
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("�����",201702022,"��ǻ�Ͱ��а�",1,4.5);
		UnderGraduate u1 = new UnderGraduate("���ֿ�",201702025,"��ǻ�Ͱ��а�",1,4.3,"���κ극��");
		Graduate g1 = new Graduate("ȫ�浿",1001100,"��ǻ�Ͱ��а�",4,3.1,true,0.5);
		System.out.println("�̸�:" +s1.name+" �й�:"+s1.studentnumber+" ����:"+s1.major+" �г�:"+s1.grade+" �̼�����:"+s1.point);
		System.out.println("�̸�:" +u1.name+" �й�:"+u1.studentnumber+" ����:"+u1.major+" �г�:"+u1.grade+" �̼�����:"+u1.point+" ���Ƹ�:"+u1.club);
		System.out.println("�̸�:" +g1.name+" �й�:"+g1.studentnumber+" ����:"+g1.major+" �г�:"+g1.grade+" �̼�����:"+g1.point+" ��������:"+g1.getAssistant() + " ���бݺ���"+g1.getScholarship());
	}

}

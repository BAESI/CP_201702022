
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("배시현",201702022,"컴퓨터공학과",1,4.5);
		UnderGraduate u1 = new UnderGraduate("서주연",201702025,"컴퓨터공학과",1,4.3,"프로브레인");
		Graduate g1 = new Graduate("홍길동",1001100,"컴퓨터공학과",4,3.1,true,0.5);
		System.out.println("이름:" +s1.name+" 학번:"+s1.studentnumber+" 전공:"+s1.major+" 학년:"+s1.grade+" 이수학점:"+s1.point);
		System.out.println("이름:" +u1.name+" 학번:"+u1.studentnumber+" 전공:"+u1.major+" 학년:"+u1.grade+" 이수학점:"+u1.point+" 동아리:"+u1.club);
		System.out.println("이름:" +g1.name+" 학번:"+g1.studentnumber+" 전공:"+g1.major+" 학년:"+g1.grade+" 이수학점:"+g1.point+" 조교유형:"+g1.getAssistant() + " 장학금비율"+g1.getScholarship());
	}

}

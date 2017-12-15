
public class Student {
	public String name;
	public int studentnumber;
	public String major;
	public int grade;
	public double point;

	public Student(String n, int s, String m, int g, double p) {
		name = n;
		studentnumber = s;
		major = m;
		grade = g;
		point = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getStudentnumber() {
		return studentnumber;
	}

	public void setStudentnumber(int s) {
		studentnumber = s;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String m) {
		major = m;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int g) {
		grade = g;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double p) {
		point = p;
	}
}

class UnderGraduate extends Student {

	public String club;

	public String getClub() {
		return club;
	}

	public void setClub(String c) {
		club = c;
	}

	public UnderGraduate(String n, int s, String m, int g, double p, String c) {
		super(n, s, m, g, p);
		club = c;
	}
}

class Graduate extends Student {

	private boolean assistant;

	private double scholarship;

	Graduate(String n, int s, String m, int g, double p, boolean a, double sc) {

		super(n, s, m, g, p);
		assistant = a;
		if (sc <= 1 && 0 <= sc) {
			scholarship = sc;

		}

	}

	public String getAssistant()

	{
		if (assistant == true)

			return "교육조교";

		else

			return "연구조교";

	}

	public void setAssistant(boolean a) {

		assistant = a;

	}

	public double getScholarship() {

		return scholarship;

	}

	public void setScholarship(double sc) {

		if (0 <= sc && sc <= 1) {

			scholarship = sc;

		}

	}

}

package com_����6;

public class Id {

	
	private String id;
	private String password;
	private String lid;
	private String lpassword;

	public String getid() {
		return id;
	}

	public void setid(String i) {
		id = i;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String p) {
		password = p;
	}

	public String getlid() {
		return lid;
	}

	public void setlid(String li) {
		lid = li;
	}

	public String getlpassword() {
		return lpassword;
	}

	public void setlpassword(String lp) {
		lpassword = lp;
	}

	public void login() {
		if (id.equals(lid)) {
			if (password.equals(lpassword)) {
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
			} else
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
		} else
			System.out.println("�α��ο� �����Ͽ����ϴ�.");

	}
}
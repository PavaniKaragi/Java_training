package Oops;

public class Student {

	int sid;
	String sname;
	char grade;

	Student(int id, String name, char g) {
		sid = id;
		sname = name;
		grade = g;
	}

	void getvalues(int id, String name, char g)// parameters/arguments
	{
		sid = id;
		sname = name;
		grade = g;
	}

	void display() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(grade);
	}

}

package Oops;

//using constructor
class Student {

	int sid;
	String sname;
	char grade;

	Student(int id, String name, char g)// parameters/arguments
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

public class constructor {

	public static void main(String[] args) {

		/*
		 * Student stu1 = new Student();// stu1 is object reference variable
		 * 
		 * // approach1- assigning the values using object reference variable stu1.sid =
		 * 111; stu1.sname = "arun"; stu1.grade = 'A';
		 * 
		 * // approach2-using method stu1.getvalues(100, "pavani", 'A');
		 */

		// approach3- using constructor
		Student stu1 = new Student(100, "pavan", 'D');
		Student stu2 = new Student(101, "pavani", 'A');

		stu1.display();
		System.out.println();
		stu2.display();

	}

}

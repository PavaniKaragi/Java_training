package Oops;

public class StudentMain {

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

		stu1.display();

	}

}

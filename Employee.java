package Oops;

public class Employee {
	// class variables
	int eid;
	String ename;
	int deptno;
	String job;

	// class methods
	void display() // doesn't return any value
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(deptno);
		System.out.println(job);
	}

	public static void main(String[] args) {

		// Main method
		Employee emp1 = new Employee(); // creating object for the class employee
		emp1.eid = 100;
		emp1.ename = "Pavani";
		emp1.deptno = 20;
		emp1.job = "Intern";

		Employee emp2 = new Employee(); // creating object for the class employee
		emp2.eid = 200;
		emp2.ename = "Pavan";
		emp2.deptno = 10;
		emp2.job = "Intern";

		emp1.display();
		System.out.println();
		emp2.display();
	}
}

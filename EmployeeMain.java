package Oops;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee(); // creating separate mainmethod in different class
		emp1.eid = 102;
		emp1.ename = "Kajal";
		emp1.deptno = 30;
		emp1.job = "deveops";

		emp1.display();
	}

}

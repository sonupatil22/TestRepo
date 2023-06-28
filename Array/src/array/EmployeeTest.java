package array;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee empList[] = new Employee[3];

		Employee s1 = new Employee(101, "Sonal", 55000);
		Employee s2 = new Employee(105, "Aarya", 80000);
		Employee s3 = new Employee(500, "Aashu", 50000);

		empList[0] = s1;
		empList[1] = s2;
		empList[2] = s3;

		System.out.println(empList[0]);
		System.out.println(empList[1]);
		System.out.println(empList[2]);
		System.out.println("==========================================================");

		// if we want to print data 1000 data so this is not good to write syso
		// statement
		// so that instead of syso we can use enhanced for loop

		for (Employee emp : empList) {
			System.out.println(emp);
		}
		System.out.println("==========================================================");

		for (Employee emp : empList) {
			if (emp.getId() > 200 || emp.getSalary() > 100000)
				System.out.println(emp);
		}
		System.out.println("==========================================================");
		
		for (Employee emp : empList) {
			if (emp.getId() < 350)
				System.out.println(emp);
		}
		System.out.println("==========================================================");
		
		
		
	}

}


import java.util.Scanner;

public class TestEmp {

	public static Emp accept() throws LowSalaryException{
		
		Scanner sc = new Scanner(System.in);
		Emp emp = null;
		
		System.out.println("Enter Employee Id : ");
		int empId = sc.nextInt();
		
		System.out.println("Enter Employee Name : ");
		String empName = sc.next();
		
		System.out.println("Enter Employee Designation [1/2/3] : ");
		System.out.println("1 : Manager\t2 : Officer\t3 : CLERK");
		int empDes = sc.nextInt();
		String des = "Manager";
		if(empDes==1) des = "Manager";
		if(empDes==1) des = "Officer";
		if(empDes==1) des = "CLERK";
		
		System.out.println("Enter Employee Basic Salary : ");
		double basic = sc.nextDouble();
		
		try {
			if(basic < 500) {
				throw new LowSalaryException();
			}
			
			emp = new Emp(empId, empName, des, basic);
		}
		catch(LowSalaryException e) {
			System.out.println(e);
			throw e;
		}
		
		return emp;
	}
	public static void main(String[] args) {

		try {
			Emp emp = accept();
			emp.calculateHRA();
			emp.printDET();
		}
		catch(LowSalaryException e) {
			System.out.println("Cannot accept employee..");
		}
		System.out.println("Thank you ..!!");
	}

}


public class Emp {

	private int empId;
	private String empName;
	private String empDesignation;
	private double empBasic;
	private double empHra;
	
	public Emp() {
		
	}
	
	public Emp(int empId, String empName, String empDesignation, double empBasic) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empBasic = empBasic;
	}

	public void printDET(){
		
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Designation : "+empDesignation);
		System.out.println("Employee Basic Salary : "+empBasic);
		System.out.println("Employee HRA : "+empHra);
	}
	public void calculateHRA(){
		
		if(empDesignation.equalsIgnoreCase("Manager")) {
			empHra = (empBasic*10)/100;
		}
		if(empDesignation.equalsIgnoreCase("Officer")) {
			empHra = (empBasic*12)/100;
		}
		if(empDesignation.equalsIgnoreCase("Clerk")) {
			empHra = (empBasic*5)/100;
		}
	}
}

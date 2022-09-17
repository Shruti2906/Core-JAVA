import java.util.Scanner;

public class Number {

	private int a;
	private int b;
	public double result;
	
	public Number(int x ,int y) {
		a = x;
		b = y;
	}
	public void add() {
		result = a+b;
		
	}
	public void sub() {
		result = a-b;
	}
	public void mul() {
		result = a*b;
	}
	public void div() {
		result = a/(float)b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean flag = false;
		try {
			if (b == 0) {
				flag = true;
				throw new ArithmeticException();
			}
			
		}
		catch(ArithmeticException e) {
			System.out.println("Exception : "+e);
		}
		
		Number num = new Number(a, b);
		
		String str;
		
		if(!flag) {
			do {
				System.out.println("1 : add\n2 : sub\n3 : mul\n4 : div");
				System.out.println("Enter your choice : ");
				int ch = sc.nextInt();
				switch(ch) {
				case 1: 
					num.add();
					break;
					
				case 2:
					num.sub();
					break;
				
				case 3:
					num.mul();
					break;
				
				case 4:
					num.div();
					break;
				
				default : 
					System.out.println("Invalid choice..");
				}
				System.out.println("result is : "+num.result);
				System.out.println("do you want to continue(Y/N) : ");
				str = sc.next();
			}while(str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("y"));
		}
		
		System.out.println("Thank You ..!!");
		
	}
}

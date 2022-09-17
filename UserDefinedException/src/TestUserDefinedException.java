import java.util.Scanner;

public class TestUserDefinedException {

	public static void display() throws InvalidAgeException{
		
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter Age : ");
		age = sc.nextInt();
		
		try {
			if(age < 18) {
				throw new InvalidAgeException();
			}
			
		}
		catch(InvalidAgeException e) {
			System.out.println("Exception is : "+e);
			throw new InvalidAgeException();
			//System.out.println(e.getMessage());
		}
		System.out.println("Enter Percentage : ");
		float perct = sc.nextFloat();
		try {
			if(perct < 70) {
				throw new InvalidPercException(perct);
			}
		}
		catch(InvalidPercException e) {
			System.out.println("Exception : "+e);
		}
		System.out.println("thank you");
		
	}
	
	public static void main(String[] args) {

		try {
			
			display();
			System.out.println("You are Passed ...!!");
		}
		catch(InvalidAgeException e) {
			System.out.println("Better Luck next time");
		}
		
	}

}

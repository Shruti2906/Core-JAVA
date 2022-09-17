
public class ExceptionEx {

	public static void main(String[] args) {
	
		float result;
		
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]); 
			
			result = n1/n2;
			
			System.out.println("Division is : "+result);
		}
		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("Print this line in anyhow");
		}
		System.out.println("Thank You !!");
		
	}

}

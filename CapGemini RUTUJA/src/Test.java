import java.util.Arrays;

interface A{
	
	void fun();
}
interface C{
	
}
interface B extends A, C{
	
}

class D implements A{	//extends B is not valid here

	@Override
	public void fun(){
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		
		
		 String[] ar = new String[5];
	        Arrays.fill(ar, "Hello");
	         //String #he = "5.8";
	        System.out.println("Hello, World!"+ar[1]);

	}

}

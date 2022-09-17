//functional interface is a interface which has only one abstract method 
//though it could have any number of default and static methods

@FunctionalInterface
interface DemoInterface{
	
	void say(String msg);
	
}

/*//  boiler plate code
  
  class Demo implements DemoInterface{

	@Override
	public void say(String msg) {
		System.out.println("DemoInterface say "+msg+"\t !!");
		
	}
	
}*/

public class TestInterface {

	public static void main(String[] args) {
	
	//  boiler plate code
	//	DemoInterface d = new Demo();
	//	d.say("Hello");
		
		
		//lambda expression
		DemoInterface ref = (String msg) ->{
			System.out.println("DemoInterface say "+msg+"\t !!");
			
		};
		
		//calling lambda expression
		ref.say("Hello");

	}

}
//lambda expression is used to remove boiler plate (extra) code

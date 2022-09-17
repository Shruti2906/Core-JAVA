
public class TestDefaultMethodInterface implements InterfaceWithDefualtMethod{

	public static void main(String[] args) {

		TestDefaultMethodInterface test = new TestDefaultMethodInterface();
		test.fun();

		InterfaceWithDefualtMethod ref;
		//ref.fun();     //ref is not initialized
		
	}
	
	@Override
	public void fun() {	//overriding interface's fun()
		
		InterfaceWithDefualtMethod.super.fun();
		System.out.println("fun of implementing class");
	}
	

}
/*
 * NOTE : default method of interface is inherited and
 * 		  can be overridden in implementing classes
 * 
 * 		it will not cause any ambiguity..as it cannot be called using interface object (as interface cannot be instantiated)
 * 
 * */

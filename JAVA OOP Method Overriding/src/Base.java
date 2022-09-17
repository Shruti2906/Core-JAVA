
public class Base {

	//4. private methods cannot be overridden
	 	private void m1()
	    {
	        System.out.println("From Base m1()");
	    }
	 	
	//protected methods can be overridden ..Access modifier can be increased but cannot be decreased
	 //e.g in derived class m2 can be declared as public but not private
	 	protected void m2()
	    {
	        System.out.println("From Base m2()");
	    }
	 	
	//overridden method
	public void show() {
		System.out.println("Base show..");
	}
	
	public static void fun(){
		System.out.println("static fun from base");
	}
}

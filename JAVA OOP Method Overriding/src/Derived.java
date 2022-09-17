
public class Derived extends Base{

	//overriding method
	
	//3. protected methods can be overridden ..Access modifier can be used to increase the visibility but cannot be used to
	//decreased it.!
	//e.g in derived class m2 can be declared as public but not private
	public void m2()
    {
	      System.out.println("From derived m2()");
	}
	
	@Override
	public void show() {
		
		//2. calling overridden method is possible in this class using super keyword
		super.show();
		System.out.println("Derived show..");
	}
	

	public static void fun(){	//fun is not overridden it simply hides Base class fun
		System.out.println("static fun from derived");
	}
}

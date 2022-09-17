
public class UserTrail {

	private int val1;
	private int val2;
	
	public UserTrail(int val1, int val2) {

		this.val1 = val1;
		this.val2 = val2;
	}
	
	public boolean show() throws IllegalValueException{
		
		
			if(val1<0 || val2<0) {
				throw new IllegalValueException();
				
			}
			else {
				return false;
			}
	}
	public static void main(String[] args) {
		
		UserTrail e = new UserTrail(1, 1);
		
		try {
			boolean b = e.show();
			System.out.println("Values are valid..");
		}
		catch(IllegalValueException ex) {
			System.out.println(ex);
		}
	}

}

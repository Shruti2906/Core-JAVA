
public class InvalidPercException extends Exception {

	float perc;
	public InvalidPercException(float perc) {
		this.perc = perc;
		//System.out.println("Your Percentage is : "+perc);
		
	}
	public String toString() {
		return "Your Percentage is "+perc+" which is not valid..";
	}
}

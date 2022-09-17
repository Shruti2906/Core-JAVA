
import java.util.Scanner;

public class RectangleInfo {
	
	public float calculateArea(Rectangle r){
		
		float area = r.getLength()*r.getBreadth();
		return area;
	}
	
	public void display(Rectangle r) {
		
		System.out.println("length of rectangle : "+r.getLength());
		System.out.println("Breadth of Rectangle : "+r.getBreadth());
		System.out.println("Area of Rectangle : "+r.getArea());
	}
	
}

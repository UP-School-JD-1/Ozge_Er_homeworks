package Shapee;

public class ShapeTest {
	public static void main(String[] args) {
		// objects were created
		Circle circle=new Circle(3);
		Rectangle rectangle=new Rectangle(3, 4);
		
		//hascode
		System.out.println("circle's hashcode:"+circle.hashCode());
		System.out.println("rectangle's hashcode:"+rectangle.hashCode());
		
		//toString
		System.out.println("toString (circle):"+circle.toString());
		System.out.println("circle':"+circle.hashCode());
	}

}

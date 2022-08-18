package Shape;

public class ShapeTest {
	
public static void main(String[] args) {
	//objects were created
	
	Circle circ =new Circle(3);
	Rectangle rect =new Rectangle(6, 8);
	Square squa = new Square(5);
	Triangle tria = new Triangle(4, 6);
	
	// areas
	System.out.println("triagle's area: "+tria.calculateArea());	
	System.out.println("rectangle's area: "+rect.calculateArea());
	
	// equals
	System.out.println("is base equal?\n"+tria.equals(tria));
	System.out.println("is radius equal?\n"+circ.equals(circ));
	
	//hashCode
	System.out.println("square's hashCode: "+squa.hashCode());
	System.out.println("circle's hashCode: "+circ.hashCode());
	
	//toString 
	System.out.println("toString method:"+rect.toString());
}
	

	
}

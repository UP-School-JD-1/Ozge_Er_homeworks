package Shape;
import java.lang.Math;
//import java.util.Objects;

public class Circle extends Shape {
private double radius;
	
	
	public Circle(double radius) {
		//super kullanmis olmak icin 
		super("circle");
		this.radius=radius;
	}
	
	@Override
	public double calculateArea() {
		area=Math.PI*Math.pow(getRadius(),2);
		return area;
	}
	
	@Override
	public double calculateCircumference() {
		circumference=2*Math.PI*getRadius();
		return circumference;
	}
	
	@Override
	public boolean equals(Object o) {
		//default equals
		if (o==this) {
			return true;
		}
		
		//control
		if(!(o instanceof Circle)) {
			return false;
		}
		
		Circle c = (Circle) o;
		return getRadius()==c.getRadius();
	}
	
	@Override
	public String toString() {
		return "radius of the circle is:"+getRadius();
	}
	
	@Override
	public int hashCode() {
		int stuff=(int) (100*Math.random());
		return (int) (stuff+getRadius()); //radius double.
		}
	
		
	 double getRadius() {
			return radius;
		}
	
}

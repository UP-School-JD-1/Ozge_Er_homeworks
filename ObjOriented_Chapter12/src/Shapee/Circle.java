package Shapee;

public class Circle extends Shape {

	double radius;
	public Circle(double radius) {
		super("circle");
		this.radius=radius;
	}
	
	@Override
	void draw() {
		System.out.println("Circle is drawing");
	}
	
	@Override
	void erase() {
		System.out.println("Circle is erasing");
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
	public boolean equals (Object o) {
		//default equals
		if (o==this) {
			return true;
		}
		// control
		if(!(o instanceof Circle)) {
			return false;
		}
		
		Circle c = (Circle) o;
		return getRadius()==c.radius;
	}
	
	@Override
	public int hashCode() {
		int stuff= (int) (101*Math.PI);
		return (int) (stuff+getRadius());
	}
	
	@Override
	public String toString() {
		return "radius of circle"+getRadius();
	}
	
	
	
	double getRadius() {
		return radius;
	}
	
}

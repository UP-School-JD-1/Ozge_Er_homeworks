package Shapee;

public class Rectangle extends Shape {
	
	int length,width;
	
	public Rectangle(int length,int width) {
		super("rectangle");
		this.length=length;
		this.width=length;	
	}
	
	@Override
	void draw() {
		System.out.println("Rectangle is drawing");
	}
	
	@Override
	void erase() {
		System.out.println("Rectangle is erasing");
	}
	
	@Override
	public double calculateArea() {
		area=getLength()*getWidth();
		return area;
	}
	
	@Override
	public double calculateCircumference() {
		circumference=2*(getLength()+getWidth());
		return circumference;
	}
	
	
	@Override
	public boolean equals (Object o) {
		if (o==this) {
			return true;
		}
		
		if(!(o instanceof Rectangle)) {
			return false;
		}
		
		Rectangle r = (Rectangle) o;
		return getLength()== r.length && getWidth()==r.width;
	}
	
	@Override
	public int hashCode() {
		int stuff= (int) (101*Math.PI);
		return (int) (stuff+getLength()+getWidth());
	}
	
	@Override
	public String toString() {
		return "width of rectangle"+getWidth();
	}
	
	int getLength(){
		return length;
	}
	
	int getWidth() {
		return width;
	}
}

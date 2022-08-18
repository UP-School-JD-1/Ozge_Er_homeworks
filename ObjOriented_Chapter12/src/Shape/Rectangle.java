package Shape;

public class Rectangle extends Shape {
	
	private int length,width;
	
	public Rectangle(int length,int width) {
		super("rectangle");
		this.length=length;
		this.width=width;
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
	public boolean equals(Object o) {
		//default equals
		if (o==this) {
			return true;
		}
		
		//control
		if(!(o instanceof Rectangle)) {
			return false;
		}
		
		Rectangle r = (Rectangle) o;
		return length==r.length && width==r.width ;
	}
	
	@Override
	public String toString() {
		return "\nlength of rectangle:"+getLength()+"\nwidth of rectangle:"+getWidth();
	}
	
	@Override
	public int hashCode() {
		int stuff=(int) (101*Math.random());
		return (int) (stuff+getLength()+getWidth());
	}
	
	

	int getLength() {
		return length;
	}
	int getWidth() {
		return width;
	}
}

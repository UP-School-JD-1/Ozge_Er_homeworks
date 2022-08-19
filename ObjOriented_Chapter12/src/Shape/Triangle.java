package Shape;

public class Triangle extends Shape {
	//isosceles triangle
	private int  heigth;
	private int base;
	private int edge;
	
	public Triangle(int height,int base) {
		super("isosceles triangle");
		this.heigth=height;
		this.base=base;
	}
	
	@Override
	double calculateArea() {
		area=(getBase()*getHeight())/2;
		return area;
	}
	
	@Override
	double calculateCircumference() {
		//math kullaninca int a cast etmek lazım tabi..
		edge=(int) Math.sqrt(Math.pow(getHeight(),2)+Math.pow(getBase()/2,2));
		circumference=2*getEdge()+getBase();
		return circumference;
	}
	
	@Override
	public boolean equals(Object o) {
		//default equals
		if (o==this) {
			return true;
		}
		
		//control
		if(!(o instanceof Triangle)) {
			return false;
		}
		
		Triangle t = (Triangle) o;
		return getBase()==t.getBase() && getHeight()==t.getHeight();
	}
	
	@Override
	public String toString() {
		return "base of the triangle is :"+getBase()+"\nheigth of the triangle is:"+getHeight();
	}
	
	@Override
	public int hashCode() {
		int hash=5;
		hash=31*hash+getBase()+getHeight();
		return hash;
		}
	
	
	int getHeight() {
		return heigth;
	}
	
	int getBase() {
		return base;
	}
	
	int getEdge() {
		return edge;
	}

}

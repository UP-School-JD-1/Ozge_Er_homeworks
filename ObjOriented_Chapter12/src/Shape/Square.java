package Shape;

public class Square extends Shape{

	private int edge;
	public Square(int edge) {
		super("square");
		this.edge=edge;
	}
	
	@Override
	public double calculateArea() {
		area=getEdge()*getEdge();
		return area;	
	}
	
	@Override
	public double calculateCircumference() {
		circumference=4*getEdge();
		return circumference;
	}
	
	@Override
	public boolean equals(Object o) {
		//default equals
		if (o==this) {
			return true;
		}
		
		//control
		if(!(o instanceof Square)) {
			return false;
		}
		
		Square s = (Square) o;
		return getEdge()==s.getEdge();
	}
	
	@Override
	public String toString() {
		return "edge of the square is:"+getEdge();
	}
	
	@Override
	public int hashCode() {
		int hash=5;
		hash=31*hash+getEdge();
		return hash;
		}
	
	int getEdge() {
		return edge;
	}
}

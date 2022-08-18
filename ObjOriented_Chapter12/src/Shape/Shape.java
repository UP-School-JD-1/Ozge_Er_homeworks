package Shape;

public class Shape {
 protected double circumference;
 protected double area;
 protected String name;
 
 public Shape(String name) {
	 this.name=name;
 	}
 	
 	public void draw(){
 		System.out.println(name+"is drawing.");
 	}
 	
 	void erase() {
 		System.out.println(name+"is erasing.");
 	}
 	
 	double calculateArea() {
		return area;
 		
 	}
 	double calculateCircumference() {
 		return circumference;
 	}

	
 	
 	
}

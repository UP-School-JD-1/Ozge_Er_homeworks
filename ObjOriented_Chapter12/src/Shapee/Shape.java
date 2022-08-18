package Shapee;

public class Shape {
	 protected String name;
	 protected double area;
	 protected double circumference;
	 	public Shape(String name) {
	 		this.name=name;
	 	}
	 	
	 	void draw() {
	 		System.out.println(name+"is drawing.");
	 		
	 	}
	 	void erase() {
	 		System.out.println(name+"is erasing.");
	 		
	 	}
	
	 	double calculateArea() {
	 		return area;
	 	}
	 	
	 	double calculateCircumference() {
	 		return area;
	 	}

	 	
}

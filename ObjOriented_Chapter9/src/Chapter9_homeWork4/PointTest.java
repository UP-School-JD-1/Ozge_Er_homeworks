package Chapter9_homeWork4;

public class PointTest {
public static void main(String[] args) {
	
	Point object1=new Point();
	
	 object1.setX(3);
	object1.setY(5);
	
	int origine=object1.distanceToOrigin(3,4);
	
	double twoPoint=object1.distanceBetweenTwoPoint(3, 6, 4, 8);
	
	System.out.println(object1.getX());
	System.out.println(object1.getY());
	System.out.println("orijine olan uzaklik: "+origine);
	System.out.println("iki nokta arasi uzaklik: "+twoPoint);

	object1.move(1,2);
	System.out.println("x yonundeki yeni konumu:"+object1.getX());
	System.out.println("y yonundeki yeni konumu:"+object1.getY()); 
	
	//yalnizca tek yonde kaydiralim.
	object1.move(7,"X");
	System.out.println("x yonundeki yeni konumu-tek yon:"+object1.getX());
	object1.move(8,"Y");
	System.out.println("y yonundeki yeni konumu-tek yon:"+object1.getY());
	
	
	
	System.out.println("guncel X: "+object1.getX());
	System.out.println("guncel Y: "+object1.getY());
	
	double twoPoint2=object1.distanceBetweenTwoPoint(3,object1.getX() ,6, object1.getY());
	System.out.println("iki nokta arasi uzaklik: "+twoPoint2);
	
	
	
	
	
	
	
	
	}
}

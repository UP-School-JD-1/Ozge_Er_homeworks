package Chapter9_homeWork4;
import java.lang.Math.*;
import java.util.*;


public class Point {
	private int x;
	private int y;
	public int distance1,distance2;
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	
	public int distanceToOrigin(int x,int y){
		distance1=(int)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		return distance1;
		}
	
	public int distanceBetweenTwoPoint(int x1,int x2,int y1,int y2) {
		
		distance2=(int)Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		return distance2;
		}
	
	public  void clone(Point objectPoint) {
		Point object=new Point();
		object=objectPoint;
	} 
	
	public void move(int x,int y) {
		//mevcut konumu aldik
		int x1=getX();
		int y1=getY();
		//konumu değiştirip,ayarladik.
		int newX=x+x1;
		setX(newX);
		int newY=y+y1;
		setY(newY);
		}
	
	 public void move(int s,String direction) {
		
		
		switch(direction) {
		case "Y": 
			int y1=getY(); //mevcut y degerini alıyorum
			int newY=y1+s; /* gelen y degeri ile toplayıp yeni bir degiskene atayıp 
			set içine gönderiyorum y değerini guncellemek  içn. bu kısımda y nin önceki 
			degerini goz onune almıyor */
			setY(newY);
			break;
			
		case "X": 
			int x1=getX();
			int newX=x1+s;
			setX(newX);
			break;
			
			default:
				}
		} 
}
	

	

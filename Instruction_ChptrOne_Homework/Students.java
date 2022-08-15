package ChapterOne_Homework;

public class Students {
private int no;
private int year;
private String major;
private String name;

public Students(int no,int year,String major,String name) {
	
	this.no=no;
	this.year=year;
	this.major=major;
	this.name=name;
	}
public static void main(String[] args) {
	
}
	public void study() {
		
		System.out.println("The student study.");
	}
	
	public void register() {
		System.out.println("the student have registered");
	}
	
	//get-set methods
	public int getNo()
	{
		return no;
	}
	public void setNo(int no) {
		this.no=no;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}

	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major=major;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}


}

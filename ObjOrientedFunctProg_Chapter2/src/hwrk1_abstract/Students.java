package hwrk1_abstract;

public abstract class Students {
private int year;
private String major;
private String name;

public Students(int year,String major,String name) {
	this.year=year;
	this.major=major;
	this.name=name;
	}
	public abstract void register();

	public void study() {
		
		System.out.println("The student study.");
	}

	//get-set methods

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

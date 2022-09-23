package hwrk1_abstract;

public abstract class Students implements Comparable {
	private int year;
	private String major;
	private String name;
	protected int no;

	public Students(int year, String major, String name, int no) {
		this.year = year;
		this.major = major;
		this.name = name;
		this.no = no;
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
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int compareTo(Object o) {
		Students student = (Students) o;
		int result = 0;
		if (no == student.no) {
			result = 0;
		} else if (no < student.no) {
			result = 1;
		} else {
			result = -1;
		}

	}
}

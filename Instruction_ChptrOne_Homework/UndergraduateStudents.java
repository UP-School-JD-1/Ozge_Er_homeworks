package ChapterOne_Homework;

public class UndergraduateStudents extends Students {
	
	private String minor;
	
	public UndergraduateStudents (int no,int year,String major,String name, String minor) {
		super(no, year, major, name);
		this.minor=minor;
	}
	@Override
	public void study() {
		System.out.println("the undergraduate student study his lectures.");
	}
	
	@Override
	public void register() {
		System.out.println("the undergradute student Anıl has registered in the vocational course.");
	}
	 //get-set method
	public String getMinor() {
		return minor;
	}
	
	public void setMinor(String minor) {
		this.minor=minor;
	}
	

}

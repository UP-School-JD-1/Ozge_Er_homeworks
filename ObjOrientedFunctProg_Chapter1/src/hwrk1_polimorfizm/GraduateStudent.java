package hwrk1_polimorfizm;

public class GraduateStudent extends Students {
	
	private String advisor;
	private String thesis;
	
	public GraduateStudent(int no,int year,String major,String name,String advisor,String thesis) {
		super(no, year, major, name);
		this.advisor=advisor;
		this.thesis=thesis;
	}

	@Override
	public void study() {
		System.out.println("the graduate students study their lectures.");
	}
	
	@Override
	public void register() {
		System.out.println("the gradute students has registered in their courses.");
	}
	
	public void writeThesis() {
		System.out.println("The thesis is written by graduate students.");
	}
	
	public void meetWithAdvisor() {
		System.out.println("The students meet their advisor once in a week.");
	}
	
	//get-set methods
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor=advisor;
	}
	
	public String getThesis() {
		return thesis;
	}
	public void setThesis(String thesis) {
		this.thesis=thesis;
	}
}

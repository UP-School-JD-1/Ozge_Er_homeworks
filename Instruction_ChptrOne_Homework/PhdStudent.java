package ChapterOne_Homework;

public class PhdStudent extends GraduateStudent{
	
	private boolean qualifyingExamTaken;
	
	public PhdStudent(int no,int year,String major,String name,String thesis,String advisor, boolean qualifyingExamTaken) {
		super(no, year, major, name, thesis, advisor);
		this.qualifyingExamTaken=qualifyingExamTaken;
	}
	
	@Override
	public void study() {
		System.out.println("The Phd students study their lectures.");
	}
	@Override
	public void register() {
		System.out.println("The Phd students has registered in their courses.");
	}
	@Override
	public void writeThesis() {
		System.out.println("The thesis is written by Phd students.");
	}
	@Override
	public void meetWithAdvisor() {
		System.out.println("The Phd students meet their advisor twice in a week.");
	}
	
	public void writePaper() {
		System.out.println("Phd's writePaper");
	}
	
	public boolean getQualifyingExamTaken() {
		return qualifyingExamTaken;
	}
	//get-set
	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken=qualifyingExamTaken;
	}
	
	
	

}

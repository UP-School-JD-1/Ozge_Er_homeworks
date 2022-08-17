package hwrk1_polimorfizm;

public class MasterStudents extends GraduateStudent {
	
	public MasterStudents (int no,int year,String major,String name,String advisor,String thesis) {
		super(no, year, major, name, thesis, advisor);
	}
	
	@Override
	public void study() {
		System.out.println("The Master students study their lectures.");
	}
	@Override
	public void register() {
		System.out.println("The Master students has registered in their courses.");
	}
	@Override
	public void writeThesis() {
		System.out.println("The thesis is written by Master students.");
	}
	@Override
	public void meetWithAdvisor() {
		System.out.println("The Master students meet their advisor twice in a month.");
	}

}

package hwrk1_polimorfizm;

public class VocationalStudent extends Students {
	
	public VocationalStudent(int no,int year,String major,String name ) {
		super(no, year, major, name);
	}
	
	@Override
	public void study() {
		System.out.println("the vocational student Anil study his lectures.");
	}
	
	@Override
	public void register() {
		System.out.println("the vocational student Anıl has registered in the vocational course.");
	}

}

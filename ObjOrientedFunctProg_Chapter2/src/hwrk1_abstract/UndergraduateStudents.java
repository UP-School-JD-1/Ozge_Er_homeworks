package hwrk1_abstract;

public class UndergraduateStudents extends Students {
	
	private String minor;
	private  int no;
	
	public UndergraduateStudents (int year,String major,String name, String minor,int no) {
		super(year, major, name);
		this.minor=minor;
		this.no=no;
	}
	@Override
	public void study() {
		System.out.println("The Undergraduate student study his lectures.");
	}
	
	@Override
	public void register() {
		System.out.println("The Undergradute student has registered in the vocational course.");
	}
	@Override
	public boolean equals(Object o) {
		//default equals
		if (o==this) {
			return true;
		}

			/*if (o==null){
			return false;
			} */

		//control
		if(!(o instanceof UndergraduateStudents)) {
			return false;
		}

		UndergraduateStudents m = (UndergraduateStudents) o;
		return getNo()==m.getNo();
	}

	@Override
	public int hashCode() {
		int hash=5;
		hash=31*hash+getNo();
		return hash;
	}


	 //get-set method
	public String getMinor() {
		return minor;
	}
	
	public void setMinor(String minor) {
		this.minor=minor;
	}
	public int getNo(){
		return no;
	}

	

}

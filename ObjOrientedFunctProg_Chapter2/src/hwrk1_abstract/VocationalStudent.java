package hwrk1_abstract;

public class VocationalStudent extends Students {
	public VocationalStudent(int year,String major,String name,int no) {
		super(year, major, name,no);
		this.no=no;
	}
	@Override
	public void study() {
		System.out.println("The Vocational student study his lectures.");
	}
	
	@Override
	public void register() {
		System.out.println("The Vocational student has registered in the vocational course.");
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
		if(!(o instanceof VocationalStudent)) {
			return false;
		}

		VocationalStudent m = (VocationalStudent) o;
		return getNo()==m.getNo();
	}
	@Override
	public int hashCode() {
		int hash=5;
		hash=31*hash+getNo();
		return hash;
	}
	public String toString(){
		return "First name:"+getName()+"\nNumber:"+getNo()+"\nMajor:"+getMajor()+"\nHashCode:"+hashCode();
	}

//	@Override
//	public String toString(){
//		String info= new String();
//		return info="Registration of student who have " + v1.getName() + " name has completed.\n";
//						info+=v1.getName() + " is a vocational student.\n";
//						info+="His area: " + v1.getMajor()+"\n";
//						info+="HashCode"+v1.hashCode();
//						return info;
//	}
}

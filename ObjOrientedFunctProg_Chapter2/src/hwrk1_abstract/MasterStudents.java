package hwrk1_abstract;

public class MasterStudents extends GraduateStudent {
	private int no;

		public MasterStudents(int year, String major, String name, String advisor, String thesis,int no) {
			super(year, major, name, advisor, thesis);
			this.no=no;
		}
		public int getNo(){
			return no;
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
			if(!(o instanceof MasterStudents)) {
				return false;
			}

			MasterStudents m = (MasterStudents) o;
			return getNo()==m.getNo();
		}

		@Override
		public int hashCode() {
			int hash=5;
			hash=31*hash+getNo();
			return hash;
		}

		}


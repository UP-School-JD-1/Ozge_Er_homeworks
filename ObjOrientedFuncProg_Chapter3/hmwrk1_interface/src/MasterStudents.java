package hmwrk1_interface.src;
public class MasterStudents extends GraduateStudent {

    public MasterStudents(int year, String major, String name, String advisor, String thesis,int no) {
        super(year, major, name, advisor, thesis,no);
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
    @Override
    public String toString(){
        return "First name:"+getName()+"\nNumber:"+getNo()+"\nMajor:"+getMajor()+"\nAdvisor:"+getAdvisor()+"\nThesis:"+getThesis()+"\nHashCode:"+hashCode();
    }

}


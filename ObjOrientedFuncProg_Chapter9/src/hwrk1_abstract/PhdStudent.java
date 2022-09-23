package hwrk1_abstract;

public class PhdStudent extends GraduateStudent{

    boolean qualifyingExamTaken;

    public PhdStudent(int year,String major,String name,String thesis,String advisor,int no,boolean qualifyingExamTaken) {
        super(year, major, name, advisor, thesis,no);
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
        if(!(o instanceof PhdStudent)) {
            return false;
        }

        PhdStudent r = (PhdStudent) o;
        return getNo()==r.getNo();
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



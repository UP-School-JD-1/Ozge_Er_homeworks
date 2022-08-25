package hmwrk1_interface.src;

public abstract class GraduateStudent extends AbstractStudents {

    private String advisor;
    private String thesis;

    public GraduateStudent(int year, String major, String name, String advisor, String thesis, int no) {
        super(year, major, name, no);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        System.out.println("The graduate students study their lectures.");
    }

    @Override
    public abstract void register();

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
        this.advisor = advisor;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }


}
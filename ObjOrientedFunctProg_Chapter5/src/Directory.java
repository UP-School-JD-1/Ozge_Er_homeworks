public class Directory extends Employee {
    String major;

    static final int Salaryfactor=1000;
    static final int bonus=1250;

    public Directory(String firstname, String surname, long tc, int experienceYears){
        super(firstname,surname,tc,experienceYears);
        this.major=major;
    }

    @Override
    public int calculateSalary(int experienceYears){
        return Salaryfactor*getExperienceYears()+bonus;
    }

    @Override
    public void work() {
        System.out.println("director works.");
    }

    @Override
    public int getSalary() {
        return calculateSalary(getExperienceYears());
    }

    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major=major;
    }

}

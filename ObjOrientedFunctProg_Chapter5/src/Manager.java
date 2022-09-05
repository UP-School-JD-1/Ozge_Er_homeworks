public class Manager extends Employee {
    String department;

    static final int Salaryfactor=750;
    static final int bonus=750;

    public Manager(String firstname,String surname,long tc,int experienceYears){
        super(firstname,surname,tc,experienceYears);
    }

    @Override
    public int calculateSalary(int experienceYears){
        return Salaryfactor*getExperienceYears()+bonus;
    }

    @Override
    public void work() {
        System.out.println("manager works.");
    }

    @Override
    public int getSalary() {
        return calculateSalary(getExperienceYears());
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department=department;
    }

}

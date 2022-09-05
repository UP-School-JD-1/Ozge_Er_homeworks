public abstract class Employee implements IEmployee {
    private String firstname;
    private String surname;
    private long tc;
    private int experienceYears;

    public static final int Salaryfactor=500;

    public Employee(String firstname,String surname,long tc,int experienceYears){
        this.firstname=firstname;
        this.surname=surname;
        this.tc=tc;
        this.experienceYears=experienceYears;

    }

//    public int calculateSalary(int experienceYears){
//        return Salaryfactor*getExperienceYears();
//    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public long getTc(){
        return tc;
    }
    public void setTc(long tc){
        this.tc=tc;
    }

    public int getExperienceYears(){
        return experienceYears;
    }
    public void setExperienceYears(int experienceYears){
        this.experienceYears=experienceYears;
    }

    @Override
    public String toString(){
        return getFirstname()+"nin maasi:"+calculateSalary(getExperienceYears());
    }
}

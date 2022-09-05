public class SalaryPaidOnBankException extends Exception {

    int salary;
    public SalaryPaidOnBankException(String message,int salary){
        super(message);
        this.salary=salary;
    }

    public SalaryPaidOnBankException(String message){
        super(message);
    }

    public int getSalary(){
        return  salary;
    }


}

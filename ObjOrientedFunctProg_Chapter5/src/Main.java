public class Main {
    public static void main(String[] args) {
        Employee directory1 = new Directory("ayse", "er", 12456, 17);
        Employee manager1 = new Manager("deniz", "er", 1561321, 1);
        try {
            print(directory1);
            if ( calculate(directory1)>7000) {
                throw new SalaryPaidOnBankException("bankadan cekmelisiniz");
            }

        } catch (SalaryPaidOnBankException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }

    public static int calculate(Employee e){
        return e.calculateSalary(e.getExperienceYears());
    }
    public static void print(Employee e){
        e.work();
        if(e instanceof Manager manager){
            System.out.println("yonetici "+manager.getFirstname()+" beyin maasi:"+e.getSalary());
        }
        else if(e instanceof Directory directory){
            System.out.println("direktor "+directory.getFirstname()+"nin maasi:"+e.getSalary());
        }
    }

    }


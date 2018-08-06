public class Salary extends Employee{

    private double Salary;


    public Salary(String name, String address, int number, double cheese){
        super(name, address, number);
        setSalary(cheese);
    }

    public void mailCheck(){
        System.out.println("Within mail check of salaray class");
        System.out.println("Mailing check to "+ getName() + " with salary "+ Salary);
    }

    public double getSalary(){
        return Salary;
    }

    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            this.Salary = newSalary;
        }
    }

    public double computePay(){
        System.out.println("Computing salary pay for "+getName());
        return Salary / 52;
    }


}

public abstract class Employee {
    private String Name;
    private String Address;
    private int Number;

    public Employee(String name, String address, int number){
        System.out.println("Constructing an employee");
        this.Name = name;
        this.Address = address;
        this.Number = number;
    }

    public double computePay(){
        System.out.println("Inside employee compute pay");
        return  0.0;
    }
    public void mailCheck(){
        System.out.println("Mailing a check to "+ this.Name);
    }
    public String getName(){
       return this.Name;
    }
    public String getAddress(){
        return this.Address;
    }
    public int getNumber(){
        return this.Number;
    }

    public void setName(){
    }
    public void setAddress(){
    }
    public void setNumber(){
    }

    public String toString(){
        String employAdd = this.Name + this.Address + this.Number;
        return employAdd;
    }

}

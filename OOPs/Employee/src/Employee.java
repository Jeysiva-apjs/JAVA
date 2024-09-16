class Employee{
    String name;
    int age;
    double salary;
    Location location;
    static String COMPANY = "Aptean"; 

    Employee(String name, int age, double salary, Location location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary(double raiseAmount){
        this.salary += raiseAmount;
        System.out.println("The revised salary of Employee " + this.name + " is " + this.salary);
    }

    @Override
    public String toString() {
        return "Employee " + this.name + " is working at " + COMPANY + ", " + this.location;
    }

}
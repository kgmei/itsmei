class Employee {
    protected String name;
    protected double basicSalary;

     Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
       double basicSalary = 12000;
        return basicSalary; 
    }

    public String getName() {
        return name;   
    }
}

class juniorengineer extends Employee {
    private double allowance;

    public juniorengineer(String name, double basicSalary, double allowance) {
        super(name, 18000);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + allowance; 
    }
}

class  seniorengineer extends Employee {
    private double hra;

    public  seniorengineer(String name, double basicSalary, double hra) {
        super(name, 25000);
        this.hra = hra;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + hra; 
    }

    public double getSalary(double allowance) {
        return super.calculateSalary() + hra + allowance; 
    }
}

class Leader extends Employee {
    private double pfPercentage;

    public Leader(String name, double basicSalary, double pfPercentage) {
        super(name, 35000);
        this.pfPercentage = pfPercentage;
    }

    @Override
    public double calculateSalary() {
        double pfAmount = (pfPercentage / 100) * basicSalary;
        return super.calculateSalary() - pfAmount; 
    }

    public double getSalary(double allowance) {
        return super.calculateSalary() - ((pfPercentage / 100) * basicSalary) + allowance; 
    }
}

public class newemployee {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 12000.0);
        System.out.println(employee.getName() + " Salary: $" + employee.calculateSalary());

        juniorengineer Jr = new juniorengineer("Jane Smith", 18000.0, 5000.0);
        System.out.println(Jr.getName() + " Salary with Allowance: $" + Jr.calculateSalary());

        seniorengineer Sr = new  seniorengineer("Alex Brown", 25000.0, 3000.0);
        System.out.println(Sr .getName() + " Salary with HRA: $" + Sr .calculateSalary());
        System.out.println(Sr .getName() + " Salary with Allowance and HRA: $" + Sr .getSalary(2000.0));

        Leader Lr = new Leader("Emma Johnson", 35000.0, 10.0);
        System.out.println(Lr.getName() + " Salary with PF deduction: $" + Lr.calculateSalary());
        System.out.println(Lr.getName() + " Salary with Allowance and PF deduction: $" + Lr.getSalary(3000.0));
    }
}

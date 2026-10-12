class SalaryEmployee {

    private int id;
    private String name;
    private double salary;

    public SalaryEmployee() {
        this(101, "Alice", 50000.0);
    }

    public SalaryEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;

        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    public void giveRaise(int percent) {
        if (percent > 0) {
            double raiseAmount = salary * (percent / 100.0);
            salary += raiseAmount;

            System.out.println(name + " received a " + percent
                    + "% raise. New Salary: ₹" + salary);
        } else {
            System.out.println("Raise percentage must be positive.");
        }
    }
}

public class SalaryManagement {
    public static void main(String[] args) {

        SalaryEmployee emp = new SalaryEmployee();

        System.out.println("Initial Salary: ₹" + emp.getSalary());

        emp.setSalary(emp.getSalary() * 1.08);


        emp.setSalary(-25000);

        System.out.println("Final Verified Salary: ₹" + emp.getSalary());
   }
}
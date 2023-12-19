class Employee extends Person implements Payable {
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        super(name);
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + getName() + "', salary=" + salary + ", department='" + department + "'}";
    }
}

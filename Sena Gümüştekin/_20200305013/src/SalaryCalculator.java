public class SalaryCalculator implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public SalaryCalculator(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "SalaryCalculator{hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked + '}';
    }
}

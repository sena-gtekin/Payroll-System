import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Inheritance and Polymorphism
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Sena", 60000, "IT"));
        employeeList.add(new Employee("Melek", 75000, "HR"));
        employeeList.add(new Employee("Büşra", 80000, "Marketing"));
        employeeList.add(new Employee("Gamze", 70000, "Finance"));
        employeeList.add(new Employee("Nilay", 65000, "IT"));

        // Generic Class
        PayrollSystem<Employee> payrollSystem = new PayrollSystem<>();
        employeeList.forEach(payrollSystem::addEmployee);
        payrollSystem.displaySalaries();

        // Lambda Functions
        List<Employee> highSalaryEmployees = employeeList.stream()
                .filter(e -> e.calculateSalary() > 70000)
                .collect(Collectors.toList());

        // Printing High Salary Employees using Lambda Functions
        System.out.println("High Salary Employees:");
        highSalaryEmployees.forEach(employee -> System.out.println(employee.getName() + "'s Salary: $" + employee.calculateSalary() + ", Department: " + employee.getDepartment()));

        // Filter employees by department using the new Set-based method
        Set<Employee> marketingEmployees = payrollSystem.filterByDepartment("Marketing");

        // Display employees filtered by department
        System.out.println("Marketing Department Employees:");
        marketingEmployees.forEach(employee ->
                System.out.println(employee.getName() + "'s Salary: $" +
                        employee.calculateSalary() + ", Department: " + employee.getDepartment()));
    }
}
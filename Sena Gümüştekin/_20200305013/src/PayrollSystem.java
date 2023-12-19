import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class PayrollSystem<T extends Person & Payable> {
    private Set<T> employees = new HashSet<>();

    // Person ve Payable arayüzünü implement eden nesneleri (aldığı için employee gibi farklı sınıflar bu nesneleri kullanabilir) Set'e ekleyen metot.
    public void addEmployee(T employee) {
        employees.add(employee);
    }

    // Person ve Payable arayüzünü implement eden nesnelerin maaşlarını ekrana yazdıran metot.
    public void displaySalaries() {
        for (T employee : employees) {
            System.out.println(employee.getName() + "'s Salary: $" + employee.calculateSalary() + ", Department: " + ((Employee) employee).getDepartment());
        }
    }

    // Verilen departman ismine sahip çalışanları Set'ten filtreleyen metot
    public Set<T> filterByDepartment(String department) {
        return employees.stream()
                .filter(employee -> department.equals(((Employee) employee).getDepartment()))
                .collect(Collectors.toSet());
    }
}
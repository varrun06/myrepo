//Example of Aggregation
package Examples;
import java.util.ArrayList;
import java.util.List;


class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}


class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", 101);
        Employee employee2 = new Employee("Bob", 102);

        Department hrDepartment = new Department("HR");
        hrDepartment.addEmployee(employee1);
        hrDepartment.addEmployee(employee2);

        
        System.out.println("Department Name: " + hrDepartment.getName());
        System.out.println("Employees in the " + hrDepartment.getName() + " department:");

        for (Employee employee : hrDepartment.getEmployees()) {
            System.out.println("Employee ID: " + employee.getEmployeeId() + ", Name: " + employee.getName());
        }
    }
}

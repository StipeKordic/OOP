import java.util.ArrayList;
import java.util.HashMap;

class EmployeeManagementSystem {
    private ArrayList<Employee> employees;
    private HashMap<Integer, Employee> employeeMap;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
        this.employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
        this.employeeMap.put(employee.getId(), employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : this.employees) {
            employee.displayEmployeeInfo();
            employee.displayProjects();
            System.out.println();
        }
    }

    public Employee findEmployeeById(int id) {
        return employeeMap.get(id);
    }

}

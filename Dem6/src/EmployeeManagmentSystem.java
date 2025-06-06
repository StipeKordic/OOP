import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class EmployeeManagmentSystem {
    private ArrayList<Employee> employees;
    private HashMap<Integer, Employee> employeeMap;

    public EmployeeManagmentSystem(){
        this.employees = new ArrayList<>();
        this.employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee emp){
        this.employees.add(emp);
        this.employeeMap.put(emp.getId(), emp);
    }

    public Employee findEmployeeById(int id){
        if (!employeeMap.containsKey(id)) {
            throw new NoSuchElementException("Id '" + id + "' nije pronađen!");
        }
        Employee emp = this.employeeMap.get(id);
        return emp;
    }

}

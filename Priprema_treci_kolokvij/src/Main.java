import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee(1, "Ivo Ivic", 2000);
        emp1.addProject("Projekt A");
        emp1.addProject("Projekt B");

        PartTimeEmployee emp2 = new PartTimeEmployee(2, "Pero Peric", 10);
        emp2.setHoursWorked(100);
        emp2.addProject("Projekt C");

        system.addEmployee(emp1);
        system.addEmployee(emp2);

        System.out.println("Svi zaposlenici:");
        system.displayAllEmployees();



        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Unesite ID zaposlenika: ");
            int id = scanner.nextInt();
            Employee employee = system.findEmployeeById(id);
            if (employee != null) {
                employee.displayEmployeeInfo();
                employee.displayProjects();
            } else {
                System.out.println("Zaposlenik nije pronađen");
            }
        } catch (Exception e) {
            System.out.println("Neispravan unos.");
        }

    }
}
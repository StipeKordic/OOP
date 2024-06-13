import java.util.ArrayList;
abstract class Employee implements Workable {
    private int id;
    private String name;
    private double salary;
    private ArrayList<String> projects;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.projects = new ArrayList<>();
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public void displayEmployeeInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Ime: " + this.name);
        System.out.println("Plaća: " + this.calculatePay());
    }

    @Override
    public void addProject(String project) {
        this.projects.add(project);
    }

    @Override
    public void displayProjects() {
        System.out.println("Projekti: " + this.projects);
    }

    public int getId(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }

    public abstract double calculatePay();
}
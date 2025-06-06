import java.util.ArrayList;

public abstract class Employee implements  Workable{
    private int id;
    private String name;
    private RazinaIskustva razinaIskustva;

    private ArrayList<String> projects;

    public Employee(int id, String name, RazinaIskustva razinaIskustva){
        this.id = id;
        this.name = name;
        this.razinaIskustva = razinaIskustva;
        this.projects = new ArrayList<>();
    }

    public void displayEmployeeInfo(){
        System.out.println(this.id + " - " + this.name);
    }

    public abstract double calculatePay();

    @Override
    public void addProject(String project){
        this.projects.add(project);
    }

    @Override
    public ArrayList<String> displayProjects() {
        return this.projects;
    }

    public int getId(){
        return this.id;
    }
}

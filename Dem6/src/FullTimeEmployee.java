public class FullTimeEmployee extends Employee{
    private double salary;

    public FullTimeEmployee(int id, String name, RazinaIskustva razinaIskustva, double salary){
        super(id, name, razinaIskustva);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return this.salary;
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("FullTimeEmployee - " + this.salary);
    }
}

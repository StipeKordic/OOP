public class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, RazinaIskustva razinaIskustva, double hourlyRate){
        super(id, name, razinaIskustva);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0;
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay(){
        return this.hoursWorked * this.hourlyRate;
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("PartTimeEmployee - " + calculatePay());
    }
}

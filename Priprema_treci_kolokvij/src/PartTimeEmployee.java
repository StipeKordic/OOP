class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double hourlyRate) {
        super(id, name);
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hours) {
        this.hoursWorked = hours;
    }

    @Override
    public double calculatePay() {
        return this.hoursWorked * this.hourlyRate;
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("Part-Time Employee:");
        super.displayEmployeeInfo();
    }
}
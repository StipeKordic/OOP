class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculatePay() {
        return this.getSalary();
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("Full-Time Employee:");
        super.displayEmployeeInfo();
    }
}
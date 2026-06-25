package model;

public final class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int empId,String empName,Department department, Address address,int hoursWorked,double hourlyRate){
        super(empId,empName,department,address);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    @Override
    public double calcSalary() {
        return hoursWorked*hourlyRate;
    }
}

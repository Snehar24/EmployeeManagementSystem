package model;

public sealed abstract class Employee permits FullTimeEmployee,PartTimeEmployee,ContractEmployee{
    protected int empId;
    protected String empName;
    protected Department department;
    protected Address address;
    public Employee(){

    }
    public Employee(int empId,String empName,Department department, Address address){
        this.empId=empId;
        this.empName=empName;
        this.department=department;
        this.address=address;
    }
    public abstract double calcSalary();
    public void displayBasicInfo(){
        System.out.println(empId+" "+empName+" "+department+" "+address+"\n---------------------------");
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Department getDepartment() {
        return department;
    }

    public Address getAddress() {
        return address;
    }
    
    
    
}

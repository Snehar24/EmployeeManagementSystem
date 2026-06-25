package main;

import model.*;
import service.EmployeeService;


public class EmployeeMgtApp {
    public static void main(String[] args) {
        EmployeeService service=new EmployeeService();
        Address a1=new Address("Erode","TN","638011");
        Employee e1=new FullTimeEmployee(100,"Sneha", Department.ADMIN,a1,50000);
        Employee e2=new PartTimeEmployee(200,"Siva",Department.IT,a1,5,500);
        Employee e3=new ContractEmployee(300,"Harini",Department.HR,a1,20000);
        service.addEmployee(e1);
        service.addEmployee(e2);
        service.addEmployee(e3);

        service.displayEmployees();
        
        System.out.println();

        service.searchEmployee(200);

        System.out.println();

        service.employeeCount();

        System.out.println();

        service.totalPayroll();

        System.out.println();

        service.averageSalary();

        System.out.println();

        service.highestSalaryEmployee();

        System.out.println();

        service.displayByDepartment(Department.IT);

        System.out.println();

        service.removeEmployee(300);

        System.out.println();

        service.displayEmployees();
        

        System.out.println();
        
        service.sortByName();

        service.sortBySalary();

        service.departmentWiseCount();

        service.employeesAboveSalary(10000);

        service.searchByName("Sneha");

        service.displayFullTimeEmployees();

        service.generateReport();

    }
}
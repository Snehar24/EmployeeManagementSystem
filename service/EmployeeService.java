package service;

import model.Employee;
import model.Department;
import model.FullTimeEmployee;
//import model.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees=new ArrayList<>();
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void displayEmployees(){
        for(Employee emp:employees){
            emp.displayBasicInfo();
            System.out.println(emp.calcSalary());
        }
    }
     
    public void searchEmployee(int id) {

        for (Employee emp : employees) {

            if (emp.getEmpId() == id) {
                System.out.println("Employee Found");
                emp.displayBasicInfo();
                return;
            }

        }

        System.out.println("Employee Not Found");
    }
    
    public void totalPayroll() {

        double total = 0;

        for (Employee emp : employees) {
            total += emp.calcSalary();
        }

        System.out.println("Total Payroll = " + total);
    }
    
    public void highestSalaryEmployee() {

        Employee highest = employees.get(0);

        for (Employee emp : employees) {

            if (emp.calcSalary() > highest.calcSalary()) {
                highest = emp;
            }

        }

        System.out.println("Highest Salary Employee");
        highest.displayBasicInfo();
        System.out.println("Salary : " + highest.calcSalary());
    }
    
    public void averageSalary() {

        double total = 0;

        for (Employee emp : employees) {
            total += emp.calcSalary();
        }

        double avg = total / employees.size();

        System.out.println("Average Salary = " + avg);
    }
    
    public void displayByDepartment(Department department) {

        for (Employee emp : employees) {

            if (emp.getDepartment() == department) {
                emp.displayBasicInfo();
            }

        }

    }
    
    public void employeeCount() {

        System.out.println("Total Employees = " + employees.size());

    }
    
    public void removeEmployee(int id) {

        Employee remove = null;

        for (Employee emp : employees) {

            if (emp.getEmpId() == id) {
                remove = emp;
                break;
            }

        }

        if (remove != null) {
            employees.remove(remove);
            System.out.println("Employee Removed");
        } else {
            System.out.println("Employee Not Found");
        }

    }
    
    public void sortByName() {

        employees.sort((e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName()));

        System.out.println("Employees Sorted by Name");

        displayEmployees();
    }
    
    public void sortBySalary() {

        employees.sort((e1, e2) ->
                Double.compare(e2.calcSalary(), e1.calcSalary()));

        System.out.println("Employees Sorted by Salary");

        displayEmployees();
    }
    
    public void departmentWiseCount() {

        for (Department dept : Department.values()) {

            int count = 0;

            for (Employee emp : employees) {

                if (emp.getDepartment() == dept) {
                    count++;
                }

            }

            System.out.println(dept + " : " + count);
        }
    }
  
    public void employeesAboveSalary(double salary) {

        System.out.println("Employees earning above " + salary);

        for (Employee emp : employees) {

            if (emp.calcSalary() > salary) {
                emp.displayBasicInfo();
                System.out.println("Salary : " + emp.calcSalary());
            }

        }
    }
    
    
    public void generateReport() {

        System.out.println("========== EMPLOYEE REPORT ==========");

        displayEmployees();

        employeeCount();

        totalPayroll();

        averageSalary();

        highestSalaryEmployee();
    }
    
    public void searchByName(String name) {

        for (Employee emp : employees) {

            if (emp.getEmpName().equalsIgnoreCase(name)) {

                emp.displayBasicInfo();
                System.out.println("Salary : " + emp.calcSalary());
                return;
            }

        }

        System.out.println("Employee Not Found");
    }
    
    public void displayFullTimeEmployees() {

        for (Employee emp : employees) {

            if (emp instanceof FullTimeEmployee) {

                emp.displayBasicInfo();
                System.out.println("Salary : " + emp.calcSalary());

            }

        }
    }
    
    
    
}

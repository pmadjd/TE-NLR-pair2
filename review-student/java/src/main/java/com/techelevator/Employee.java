package com.techelevator;

public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;

    public final static double STARTING_SALARY = 60000;

    public void setSalary(double salary){
        this.salary = STARTING_SALARY;
    }

    public Employee (long employeeId, String firstName, String lastName, String email, Department department, String hireDate){

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;

    }

    public long getEmployeeId(){ return employeeId; }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public double getSalary(){      return salary;    }
    public Department getDepartment(){
        return department;
    }
    public String getHireDate(){
        return hireDate;
    }

    public Employee (){

    }

    public String getFullName(String lastName, String firstName){
        String fullName = lastName + ", " + firstName;
        return fullName;
    }
    public double raiseSalary(double percent, double salary){
        double salaryWithRaise = salary + (percent * salary);
        return salaryWithRaise;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}

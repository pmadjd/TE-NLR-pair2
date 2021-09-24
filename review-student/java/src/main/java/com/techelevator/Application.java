package com.techelevator;

import javax.print.attribute.standard.MediaSize;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Application {

    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();
    Department department1, department2,department3;


    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {

        // create some departments
        createDepartments();


        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
    department1 = new Department(1,"Marketing");
    departments.add(department1);
    department2 = new Department(2,"Sales");
    departments.add(department2);
    department3 = new Department(3,"Engineering");
    departments.add(department3);

    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
    for (Department dp : departments){
    dp.getName();
    System.out.println(dp.getName());
    }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee employee1 = new Employee(1, "Dane", "Johnson", "djohnson@teams.com", department3, "08/21/2020" );
        employees.add(employee1);
        Employee employee2 = new Employee(2, "Angie", "Smith", "asmith@teams.com", department2, "08/21/2020" );
        employees.add(employee2);
        Employee employee3 = new Employee(3, "Margaret", "Thompson", "mthomson@teams.com", department1, "08/21/2020" );
        employees.add(employee3);

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
for (Employee emp : employees){
    System.out.println(emp.getFullName(emp.getFirstName(), emp.getLastName())+" " +Employee.STARTING_SALARY +" "+ emp.getDepartment());
}
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}

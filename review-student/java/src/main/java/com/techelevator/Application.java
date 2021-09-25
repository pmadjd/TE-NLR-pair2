package com.techelevator;

import javax.print.attribute.standard.MediaSize;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Application {

    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();


    /**
     * The main entry point in the application
     *
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
        Department department1 = new Department(1, "Marketing");
        departments.add(department1);
        Department department2 = new Department(2, "Sales");
        departments.add(department2);
        Department department3 = new Department(3, "Engineering");
        departments.add(department3);

    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department dp : departments) {
            dp.getName();
            System.out.println(dp.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee employee1 = new Employee(1, "Dane", "Johnson", "djohnson@teams.com", departments.get(2), "08/21/2020");
        employees.add(employee1);
        Employee employee2 = new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(2), "08/21/2020");
        employees.add(employee2);
        Employee employee3 = new Employee(3, "Margaret", "Thompson", "mthomson@teams.com", departments.get(0), "08/21/2020");
        employees.add(employee3);

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee emp : employees) {
            if (emp.getFirstName().equals("Angie"))
                System.out.println(emp.getFullName() + " " + Employee.STARTING_SALARY * 1.1 + " " + emp.getDepartment().getName());

            else
                System.out.println(emp.getFullName() + " " + Employee.STARTING_SALARY + " " + emp.getDepartment().getName());

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

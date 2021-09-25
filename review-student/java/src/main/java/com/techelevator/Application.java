package com.techelevator;

import javax.print.attribute.standard.MediaSize;
import javax.xml.namespace.QName;
import java.util.*;

public class Application {

    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();
    Map<String, Project> projects = new HashMap<>();

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
    Project teams = new Project("TEams", "Project Management Software","10/10/2020","11/10/2020");
    List<Employee> engineeringEmployees = new ArrayList<>();
    for (int i=0; i< employees.size(); i++){
        if(employees.get(i).getDepartment().getDepartmentId()==3){
            engineeringEmployees.add(employees.get(i));
        }
    }

    teams.setTeamMembers(engineeringEmployees);
    projects.put("TEams",teams);
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project landing = new Project("Marketing Landing Page","Lead Capture Landing Pge for Marketing","10/10/2020","10/17/2020");
        List<Employee> marketingEmployees= new ArrayList<>();
        for(int i=0; i< employees.size();i++){
           if( employees.get(i).getDepartment().getDepartmentId()==1){
               marketingEmployees.add(employees.get(i));
           }
        }
        landing.setTeamMembers(marketingEmployees);
        projects.put("Marketing Landing Page", landing);

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
   for(Map.Entry<String, Project> pj: projects.entrySet()){
       System.out.println(pj.getKey()+": "+pj.getValue().getTeamMembers().size());
   }
    }

}

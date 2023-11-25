import prosit10.Departement;
import prosit10.DepartementHashSet;
import prosit9.Employer;
import prosit9.SocieteArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------Prosit 9--------------------");
        SocieteArrayList company = new SocieteArrayList();

        // Adding employees
        Employer emp1 = new Employer(1, "John", "Doe", "Manager", 2);
        Employer emp2 = new Employer(2, "Alice", "Smith", "Engineer", 1);
        Employer emp3 = new Employer(3, "Bob", "Johnson", "Developer", 3);

        // Adding employees to the company
        company.ajouterEmploye(emp1);
        company.ajouterEmploye(emp2);
        company.ajouterEmploye(emp3);

        // Displaying employees
        System.out.println("Employees in the company:");
        company.displayEmploye();

        // Sorting employees by ID
        company.trierEmployeParId();

        // Displaying employees after sorting
        System.out.println("\nEmployees after sorting by ID:");
        company.displayEmploye();

        // Sorting employees by name, department, and grade
        company.trierEmployeParNomDépartementEtGrade();

        // Displaying employees after sorting
        System.out.println("\nEmployees after sorting by name, department, and grade:");
        company.displayEmploye();

        System.out.println("--------------------Prosit 10--------------------");
        DepartementHashSet departmentSet = new DepartementHashSet();

        // Adding departments
        Departement dep1 = new Departement(101, "HR", 20);
        Departement dep2 = new Departement(102, "IT", 50);
        Departement dep3 = new Departement(103, "Finance", 30);

        // Adding departments to the set
        departmentSet.ajouterDepartement(dep1);
        departmentSet.ajouterDepartement(dep2);
        departmentSet.ajouterDepartement(dep3);

        // Displaying departments
        System.out.println("\nDepartments in the company:");
        departmentSet.displayDepartement();

        // Searching for a department by name
        String departmentNameToSearch = "IT";
        boolean foundDepartment = departmentSet.rechercherDepartement(departmentNameToSearch);
        System.out.println("\nIs the department '" + departmentNameToSearch + "' found? " + foundDepartment);

        // Sorting departments by ID
        TreeSet<Departement> sortedDepartments = departmentSet.trierDepartementById();

        // Displaying sorted departments
        System.out.println("\nDepartments after sorting by ID:");
        for (Departement dep : sortedDepartments) {
            System.out.println(dep);
        }

        // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 12);
        studentScores.put("Bob", 15);
        studentScores.put("Bob", 115);
        studentScores.put("Charlie", 14);
        studentScores.put("David", 20);

        System.out.println(studentScores);
    }

}
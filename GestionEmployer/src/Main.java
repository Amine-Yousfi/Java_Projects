import prosit9.Employer;
import prosit9.SocieteArrayList;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
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
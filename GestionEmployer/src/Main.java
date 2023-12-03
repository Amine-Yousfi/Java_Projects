import prosit10.Departement;
import prosit10.DepartementHashSet;
import prosit11.AffectationHashMap;
import prosit9.Employer;
import prosit9.SocieteArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
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
        System.out.println(" ");
        System.out.println("--------------------Prosit 11--------------------");
        AffectationHashMap affectationHashMap = new AffectationHashMap();

        Employer employer1 = new Employer(5, "Amine", "Yousfi", "Manager", 19);
        Employer employer2 = new Employer(4, "Leo", "Messi", "Player", 18);
        Employer employer3 = new Employer(6, "Cristiano", "Ronaldo", "Player", 17);

        Departement dept1 = new Departement(104, "Business", 25);
        Departement dept2 = new Departement(105, "Sport", 10);

        affectationHashMap.ajouterEmployeDepartement(employer1, dept1);
        affectationHashMap.ajouterEmployeDepartement(employer1, dept2);
        affectationHashMap.ajouterEmployeDepartement(employer2, dept2);
        affectationHashMap.ajouterEmployeDepartement(employer3, dept2);

        affectationHashMap.afficherEmployesEtDepartements();
        System.out.println("avant la suppression");
        System.out.println(dep2);
        affectationHashMap.supprimerEmployeEtDepartement(employer3, dept2);
        System.out.println("aprés la suppression");
        System.out.println(dep2);

        System.out.println("la recherche d'un departement : "+affectationHashMap.rechercherDepartement(dept1));
        System.out.println("la recherche d'un employer : "+affectationHashMap.rechercherEmploye(emp3));
        System.out.println("=======================================");
        affectationHashMap.afficherEmployes();
        System.out.println("=======================================");
        affectationHashMap.afficherDepartements();
        System.out.println("=======================================");
        System.out.println("affichage avant le tri des employees");
        affectationHashMap.afficherEmployesEtDepartements();
        System.out.println("=======================================");
        System.out.println("affichage aprés le tri des employees");
        TreeMap<Employer, Departement> sortedMap = affectationHashMap.trierMap();
        for (Map.Entry<Employer, Departement> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
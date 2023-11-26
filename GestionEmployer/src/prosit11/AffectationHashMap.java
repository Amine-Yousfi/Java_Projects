package prosit11;

import prosit10.Departement;
import prosit9.Employer;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    Map<Employer, Departement> affectations = new HashMap<>();

    public void ajouterEmployeDepartement(Employer employe, Departement departement){
        // Vérifier si l'employé est déjà affecté à un département
        if (!affectations.containsKey(employe)) {
            affectations.put(employe, departement);
            System.out.println("Affectation ajoutée : Employé " + employe.getNom() + " au Département " + departement.getNomD());
        } else {
            System.out.println("Erreur : L'employé " + employe.getNom() + " est déjà affecté à un département.");
        }
    }

    public void afficherEmployesEtDepartements(){
        for (Employer employe : affectations.keySet()) {
            System.out.println("Employé " + employe + " affecté à un Département " + affectations.get(employe));
        }
    }

    public void supprimerEmploye (Employer e){
        if (affectations.containsKey(e)) {
            affectations.remove(e);
            System.out.println("Affectation supprimée : Employé " + e.getNom() + " supprimé.");
        } else {
            System.out.println("Erreur : L'employé " + e.getNom() + " n'est pas affecté à un département.");
        }
    }
    public void supprimerEmployeEtDepartement (Employer e, Departement d){
        if (affectations.containsKey(e)) {
            affectations.remove(e);
            System.out.println("Affectation supprimée : Employé " + e.getNom() + " supprimé du Département " + d.getNomD());
        } else {
            System.out.println("Erreur : L'employé " + e.getNom() + " n'est pas affecté à un département.");
        }
    }

    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employer employe : affectations.keySet()) {
            System.out.println(employe);
        }
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement departement : affectations.values()) {
            System.out.println(departement);
        }
    }

    public boolean rechecheEmploye(Employer employee){
        return affectations.containsKey(employee);
    }

    public boolean rechecheDepartement(Departement departement){
        return affectations.containsValue(departement);
    }

    public TreeMap<Employer, Departement> trierMap() {
        // Create a TreeMap with a custom comparator to sort by employee identifiers
        TreeMap<Employer, Departement> sortedMap = new TreeMap<>(new EmployerIdComparator());

        // Add all entries from the existing map to the sorted map
        sortedMap.putAll(affectations);

        return sortedMap;
    }


}

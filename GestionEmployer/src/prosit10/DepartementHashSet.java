package prosit10;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> departements = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dep : departements){
          if(dep.getNomD().equals(nom))   return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
            departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(departements);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        Comparator<Departement> comparatorById = new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getId()- o2.getId();
            }
        };
        TreeSet<Departement> myTree = new TreeSet<>(departements);
        return myTree;
    }
}

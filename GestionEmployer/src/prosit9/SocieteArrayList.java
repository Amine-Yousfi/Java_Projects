package prosit9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employer>{

    List <Employer> employers ;

    public SocieteArrayList(){
        employers = new ArrayList<Employer>();
    }
    @Override
    public void ajouterEmploye(Employer employer) {
        employers.add(employer);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employer employer) {
        return employers.contains(employer);
    }

    @Override
    public void supprimerEmploye(Employer employer) {
        employers.remove(employers);
    }

    @Override
    public void displayEmploye() {
        System.out.println(employers);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employers);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employer> comparatorByNomD = new Comparator<Employer>() {
            @Override
            public int compare(Employer o1, Employer o2) {
                return o1.getNomP().compareTo(o2.getNomP());
            }
        };
        Comparator<Employer> comparatorByGrade = new Comparator<Employer>() {
            @Override
            public int compare(Employer o1, Employer o2) {
                return o1.getGrade()- o2.getGrade();
            }
        };

        Collections.sort(employers, comparatorByNomD.thenComparing(comparatorByGrade));
    }
}

package prosit10;

public class Departement implements Comparable<Departement> {

    private int id;
     private String nomD;
     private int nbrEmploye;

     public Departement(){}

    public Departement(int id, String nomD, int nbrEmploye){
         this.id = id;
         this.nomD = nomD;
         this.nbrEmploye = nbrEmploye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomD() {
        return nomD;
    }

    public void setNomD(String nomD) {
        this.nomD = nomD;
    }

    public int getNbrEmploye() {
        return nbrEmploye;
    }

    public void setNbrEmploye(int nbrEmploye) {
        this.nbrEmploye = nbrEmploye;
    }

    @Override
    public boolean equals(Object obj) {
         if(obj == null) return false;
         if (obj == this) return true;
         if (obj instanceof Departement d)
             return this.id == d.getId() && this.nomD.equals(d.getNomD());
        return false;
    }

    @Override
    public String toString() {
        return "id :"+ id + "Nom prosit10.Departement: "+ nomD+ "Nombre prosit9.Employer: "+ nbrEmploye;
    }

    @Override
    public int compareTo(Departement o) {
        return this.id - o.getId();
    }

    @Override
    public int hashCode() {
        return 31*this.id *45 - this.nomD.hashCode() * this.nbrEmploye;
    }
}

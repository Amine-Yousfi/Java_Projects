package prosit9;

public class Employer implements Comparable<Employer> {

    private int id;
    private String nom,prenom,nomP;
    private int grade;

    public Employer() {
    }

    public Employer(int id, String nom, String prenom, String nomP, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomP = nomP;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "prosit9.Employer{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomP='" + nomP + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj instanceof Employer employer){
            return employer.getNom().equals(this.nom) & employer.getId()== this.id;
        }
        return false;
    }

    @Override
    public int compareTo(Employer o) {
        return this.id - o.getId();
    }
}

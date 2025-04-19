public class Soldat {

    private String nom;
    private int poids;

    public Soldat(String nom, int poids) {
        this.nom = nom;
        this.poids = poids; // on peut rajouter une condition pour vérifier si le poids n'est pas négatif
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String toString(){
        return "Le nom du soldat : " + this.getNom() +
                "\nLe poids du soldat : " + this.getPoids();
    }
}


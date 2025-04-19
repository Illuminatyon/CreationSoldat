package Exercice2;

public class Arme {

    private String nom;
    private int dommage;

    public Arme(String nom, int dommage) {
        this.nom = nom;
        this.dommage = dommage;
    }

    public int getDommage() {
        return dommage;
    }

    public void setDommage(int dommage) {
        this.dommage = dommage;
    }

}

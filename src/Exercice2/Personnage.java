package Exercice2;

import static java.lang.Math.abs;

public class Personnage {

    private Arme arme;
    private String nom;
    private int PV;
    private int ptAttaque;
    private int ptDefense;

    public Personnage(String nom, int PV, int ptAttaque, int ptDefense, Arme arme) {
        /*
        On peut ajouter des conditions concernant les points de vie ou bien les points d'attaques
         */
        this.arme = arme;
        this.nom = nom;
        this.PV = PV;
        this.ptAttaque = abs(ptAttaque);
        this.ptDefense = abs(ptDefense);
    }

    public String getNom() {
        return nom;
    }

    public int getPV() {
        return PV;
    }

    public int getPtAttaque() {
        return ptAttaque;
    }

    public int getPtDefense() {
        return ptDefense;
    }

    public void attaquer(Personnage cible) {
        int degats = (this.ptAttaque + this.arme.getDommage()) - cible.getPtDefense();
        if (degats < 0) degats = 0; // pas de soins involontaires
        cible.PV -= degats;
        System.out.println(this.nom + " attaque " + cible.getNom() + " et inflige " + degats + " points de dégâts !");
        System.out.println(cible.getNom() + " a maintenant " + cible.getPV() + " PV.\n");
    }


    public String toString(){
        return "Le nom du personnage : " + this.getNom() +
                "\nLes pv ud personnage : " + this.getPV() +
                "\nLes points d'attaques du personnage : " + this.getPtAttaque() +
                "\nLes points de defense du personnage : " + this.getPtDefense();
    }

}

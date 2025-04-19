package Exercice2;

public class Magicien extends Personnage{

    public Magicien(String nom, int PV, int ptAttaque, int ptDefense) {
        super(nom, 40, 30, 10,new Hache());
    }
}

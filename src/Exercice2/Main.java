package Exercice2;

import Exercice2.Archer;
import Exercice2.Nain;

public class Main {

    public static void main(String[] args){

        Archer legolas = new Archer("Legolas");
        Nain gimli = new Nain("Gimli", 50, 20, 30);

        System.out.println("=== Début du combat ===");
        System.out.println(legolas);
        System.out.println();
        System.out.println(gimli);
        System.out.println("\n=======================\n");

        // Tour 1
        legolas.attaquer(gimli);
        gimli.attaquer(legolas);

        // Tour 2
        legolas.attaquer(gimli);
        gimli.attaquer(legolas);

        // etc. tu peux boucler jusqu'à ce qu’un personnage meure si tu veux
    }
}

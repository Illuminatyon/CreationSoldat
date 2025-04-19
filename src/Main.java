public class Main {
    public static void main(String[] args) {
        // Création d'un soldat simple
        Simple simpleSoldat = new Simple("Jean", 90);
        System.out.println("=== SOLDAT SIMPLE ===");
        System.out.println(simpleSoldat);
        System.out.println("Vitesse maximale : " + simpleSoldat.vitesseMaximale() + "\n");

        // Création d’un brancardier
        Brancardier brancardier = new Brancardier("Paul", 100);
        System.out.println("=== BRANCARDIER ===");
        System.out.println(brancardier);
        System.out.println("Vitesse maximale (sans charge) : " + brancardier.vitesseMaximale());

        // On ajoute une charge légère
        brancardier.ajouterCharge(20);
        System.out.println("\nAprès ajout de 20kg de charge :");
        System.out.println(brancardier);
        System.out.println("Vitesse maximale : " + brancardier.vitesseMaximale());

        // On ajoute une charge trop lourde
        brancardier.ajouterCharge(50);
        System.out.println("\nAprès tentative d’ajout de 50kg (trop lourd) :");
        System.out.println(brancardier);
        System.out.println("Vitesse maximale : " + brancardier.vitesseMaximale());

        // Retirer la charge
        brancardier.retirerCharge();
        System.out.println("\nAprès retrait de la charge maximale :");
        System.out.println(brancardier);
        System.out.println("Vitesse maximale : " + brancardier.vitesseMaximale() + "\n");

        // Création d’un cavalier
        Cavalier cavalier = new Cavalier("Arthur", 80);
        System.out.println("=== CAVALIER ===");
        System.out.println(cavalier);
        System.out.println("Vitesse maximale : " + cavalier.vitesseMaximale());
    }
}

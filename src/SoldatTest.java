import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SoldatTest {

    @Test
    public void testSoldat() {
        Soldat soldat = new Soldat("Léo", 80);
        assertEquals("Léo", soldat.getNom());
        assertEquals(80, soldat.getPoids());

        soldat.setNom("Marc");
        soldat.setPoids(90);

        assertEquals("Marc", soldat.getNom());
        assertEquals(90, soldat.getPoids());
    }

    @Test
    public void testSimpleVitesse() {
        Simple simple = new Simple("Tom", 85);
        assertEquals(7, simple.vitesseMaximale());

        simple.setPoids(90);
        assertEquals(6.6, simple.vitesseMaximale());

        simple.setPoids(100);
        assertEquals(7, simple.vitesseMaximale());
    }

    @Test
    public void testBrancardierSansCharge() {
        Brancardier brancardier = new Brancardier("Paul", 90);
        assertEquals(0, brancardier.vitesseMaximale() - brancardier.vitesseMaximale()); // just checking no error
        assertEquals(7, brancardier.vitesseMaximale(), 0.01);
    }

    @Test
    public void testBrancardierAvecCharge() {
        Brancardier brancardier = new Brancardier("Paul", 90);

        brancardier.ajouterCharge(20);
        // 20 < 90 / 3 => vitesse * 0.8
        assertEquals(7 * 0.8, brancardier.vitesseMaximale(), 0.01);

        brancardier.ajouterCharge(15); // total charge = 35
        // 35 > 90 / 3 = 30 ; 35 < 45 => vitesse * 0.7
        assertEquals(7 * 0.7, brancardier.vitesseMaximale(), 0.01);

        brancardier.ajouterCharge(30); // should not add (over 60)
        assertTrue(brancardier.vitesseMaximale() < 7);

        brancardier.retirerCharge();
        assertEquals(7, brancardier.vitesseMaximale(), 0.01);
    }

    @Test
    public void testCavalierVitesse() {
        Cavalier cavalier = new Cavalier("Arthur", 80);

        // Initial charge = 0
        assertEquals(15, cavalier.vitesseMaximale());

        // On modifie le champ charge manuellement via réflexion (car pas de setCharge)
        try {
            var field = Cavalier.class.getDeclaredField("charge");
            field.setAccessible(true);

            field.set(cavalier, 30);
            assertEquals(13, cavalier.vitesseMaximale());

            field.set(cavalier, 70);
            assertEquals(10, cavalier.vitesseMaximale());

            field.set(cavalier, 130);
            assertEquals(8, cavalier.vitesseMaximale());

        } catch (Exception e) {
            fail("Erreur lors de la modification de la charge via réflexion : " + e.getMessage());
        }
    }
}

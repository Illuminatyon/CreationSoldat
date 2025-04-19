package Exercice1;

import java.util.ArrayList;

public class Troupe {

    private ArrayList<Soldat> listeDeSoldat;

    public Troupe() {
        listeDeSoldat = new ArrayList<Soldat>();
    }

    public void ajouterSoldat(Soldat soldat){
        listeDeSoldat.add(soldat);
    }

    public void retirerSoldat(){
        listeDeSoldat.remove(listeDeSoldat.get(listeDeSoldat.size()-1));
    }

    public String toString() {
        for(Soldat s : listeDeSoldat){
            System.out.println(s.toString());
        }
        return null;
    }


}

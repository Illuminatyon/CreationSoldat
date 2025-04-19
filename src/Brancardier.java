public class Brancardier extends Simple{

    private int charge;
    private int chargeMaximale;

    public Brancardier(String nom, int poids) {
        super(nom, poids);
        this.charge = charge;
        this.chargeMaximale = 60;
    }

    public void ajouterCharge(int poidsEnPlus){
        if(this.charge+poidsEnPlus <= chargeMaximale){
            charge += poidsEnPlus;
        } else {
            System.out.println("La charge est beaucoup trop importante pour le brancardier");
        }
    }

    public void retirerCharge(){
        // on peut rajouter les conditions de vérifications pour si la charge devient négatif
        // ce qui n'est pas possible
        this.charge -= chargeMaximale;
    }

    public double vitesseMaximale(){
        if(this.charge == 0){
            return super.vitesseMaximale();
        } else if(this.charge < this.getPoids()/3){
            return super.vitesseMaximale()* 0.8;
        } else if (this.charge > this.getPoids()/3 && this.charge < this.getPoids()/2){
            return super.vitesseMaximale()*0.7;
        } else {
            return 4;
        }
    }

    public String toString(){
        return super.toString() +
                "\nLa charge du brancardier : " + this.charge +
                "\nLa charge maximale du brancardier : " + this.chargeMaximale;
    }
}

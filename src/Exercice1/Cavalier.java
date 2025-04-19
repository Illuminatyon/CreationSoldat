package Exercice1;

public class Cavalier extends Simple {

    private int charge;
    private int chargeMaximale;

    public Cavalier(String nom, int poids) {
        super(nom, poids);
        this.charge = charge;
        this.chargeMaximale = 150;
    }

    public double vitesseMaximale(){
        if(this.charge == 0){
            return 15;
        } else if(this.charge < 50){
            return 13;
        } else if(this.charge < 100 && this.charge > 50){
            return 10;
        } else {
            return 8;
        }
    }

    public String toString(){
        return super.toString() +
                "\nLa charge du cavalier : " + this.charge +
                "\nLa charge maximale du cavalier : " + this.chargeMaximale;
    }

}

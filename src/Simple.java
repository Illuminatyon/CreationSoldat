public class Simple extends Soldat{

    public Simple(String nom, int poids) {
        super(nom, poids);
    }

    public double vitesseMaximale(){
        if (this.getPoids() <= 85){
            return 7;
        } else if (this.getPoids() > 86 && this.getPoids() <= 95) {
            return 6.6;
        } else {
            return 7;
        }
    }
}

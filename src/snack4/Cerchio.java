package snack4;

    public class Cerchio extends Figura {

    private double raggio;

    public Cerchio(double raggio) {
        if(raggio <= 0){
            System.out.println("Il raggio inserito non è valido");
        } else {
            this.raggio = raggio;
        }
    }

    @Override
    public double calcolaArea() {
        return PI_GRECO * Math.pow(raggio, 2);
    }

    


}

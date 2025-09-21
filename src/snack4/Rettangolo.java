package snack4;

public class Rettangolo extends Figura{

    private int base;

    private int altezza;

    public Rettangolo(int altezza, int base) {
        if(altezza <0){
            System.out.println("L'altezza inserita non è corretta");
        } else {
            this.altezza = altezza;
        }
        if(base <0){
            System.out.println("La base inserita non è corretta");
        } else {
            this.base = base;
        }
    }

    @Override
    public double calcolaArea() {
        return this.base * this.altezza;
    }




}

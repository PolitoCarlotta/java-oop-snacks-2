package Snack1;

public class UsaVeicolo {
    public static void main(String[] args) {
        Auto a1 = new Auto("fiat", 1990, 5);
        System.out.println(a1.getMarca() + a1.getAnno());
        System.out.println(a1.stampaInfo());
    }
}

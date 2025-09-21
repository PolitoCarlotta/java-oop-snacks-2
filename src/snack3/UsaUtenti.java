package snack3;

public class UsaUtenti {
    public static void main(String[] args) {
        Utente u1 = new Utente("Mario");
        System.out.println(u1.getNumeroUtenti());
        Utente u2 = new Utente("Giovanni");
        System.out.println(u1.getNumeroUtenti());
        Utente u3 = new Utente("Giorgio");
        System.out.println(u3.getNumeroUtenti());
    }
}

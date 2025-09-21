package snack3;

public class Utente {


    private String nome;

    private static int numeroUtenti;

    public Utente(String nome) {
        if(nome == null || nome.isBlank()){
            System.out.println("Il nome inserito non è valido");
        }else {
            this.nome = nome;
        }

        this.numeroUtenti ++;
    }

    public static int getNumeroUtenti() {
        return numeroUtenti;
    }




}

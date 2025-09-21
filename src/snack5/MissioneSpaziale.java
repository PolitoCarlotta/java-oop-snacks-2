package snack5;

public class MissioneSpaziale {

    private String nomeMissione;

    private final int idMissione;

    private static int contatore = 0;

    public MissioneSpaziale(String nomeMissione){
        if(nomeMissione == null || nomeMissione.isBlank()){
            System.out.println("Il nome inserito non è valido");
        } else {
            this.nomeMissione = nomeMissione;
        }

        MissioneSpaziale.contatore ++;
        this.idMissione = MissioneSpaziale.contatore;
    }

    public void  stampaDettagli(){
        System.out.println("Id Missione: " + this.idMissione + ", nome missione: " + this.nomeMissione);
    }

    public static int numeroMissioni(){
        return MissioneSpaziale.contatore;
    }
}

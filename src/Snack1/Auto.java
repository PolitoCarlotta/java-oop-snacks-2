package Snack1;

public class Auto extends Veicolo {

        private int numeroPorte;

        public Auto(String marca, int anno, int numeroPorte) {
        super(marca, anno);

                if(numeroPorte <= 0){
                        System.out.println("Il numero delle porte inserito non è corretto");
                } else {
                        this.numeroPorte = numeroPorte;
                }

        }


        

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        if(numeroPorte <= 0){
                        System.out.println("Il numero delle porte inserito non è corretto");
                } else {
                        this.numeroPorte = numeroPorte;
                }
    }

    @Override
    public String stampaInfo() {
        return super.stampaInfo() + ", ha " + this.numeroPorte + " porte.";
    }



        

        
}

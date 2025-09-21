package snack2;

public class ContoRisparmio extends ContoBancario {
    

    private final double INTERESSE;

    public ContoRisparmio(String numeroConto, double interesse) {
        super(numeroConto);
        
        this.INTERESSE = interesse;
    }

    

    public void applicaInteressi(){
        double interessi = getSaldo() * (this.INTERESSE/100);
        deposita(interessi);
    }

    public double getINTERESSE() {
        return INTERESSE;
    }




}

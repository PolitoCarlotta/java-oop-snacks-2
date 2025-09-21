package Snack1;

public class Veicolo {
    
    private String marca;

    private int anno;

    public Veicolo (String marca, int anno){
        if(marca == null || marca.isBlank()){
            System.out.println("La marca inserito non è corretto");
        }else {
            this.marca = marca;
        }

        if(anno<=0){
            System.out.println("L'anno inserito inserito non è corretto");
        }else {
            this.anno = anno;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null || marca.isBlank()){
            System.out.println("La marca inserito non è corretto");
        }else {
            this.marca = marca;
        }
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        if(anno<=0){
            System.out.println("L'anno inserito inserito non è corretto");
        }else {
            this.anno = anno;
        }
    }

    public String stampaInfo(){
       return " Il veicolo ha marca: " + this.marca + ", ed è dell'anno: " + this.anno;
    }

}

package snack5;

public class UsaMissioni {
    public static void main(String[] args) {
       
            MissioneSpaziale m1 = new MissioneSpaziale("Apollo11");
    MissioneSpaziale m2 = new MissioneSpaziale("Apollo13");
    MissioneSpaziale m3 = new MissioneSpaziale("Luna Base");
    MissioneSpaziale m4 = new MissioneSpaziale("Mars Rover");
    MissioneSpaziale m5 = new MissioneSpaziale("Apollo1");

    m1.stampaDettagli();
    System.out.println(MissioneSpaziale.numeroMissioni());
    m2.stampaDettagli();
    m3.stampaDettagli();
    m4.stampaDettagli();
    m5.stampaDettagli();

    }


}

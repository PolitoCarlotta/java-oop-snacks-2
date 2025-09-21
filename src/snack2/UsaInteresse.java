package snack2;

public class UsaInteresse {

    public static void main(String[] args) {

        ContoRisparmio c1 = new ContoRisparmio("256666", 10.00);

        c1.deposita(50.00);
        System.out.println(c1);
        c1.applicaInteressi();
        System.out.println(c1);


        
    }

}

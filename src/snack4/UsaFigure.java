package snack4;

public class UsaFigure {

    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(20, 30);
        Cerchio c1 = new Cerchio(15);

        System.out.println("L'area del rettangolo è: " + r1.calcolaArea());
        System.out.println("L'area del cerchio è: " + c1.calcolaArea());
    }
}

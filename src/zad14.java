import java.util.Scanner;
public class zad14 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Jaką ocene dostałes z 1 testu? ");
        int ocena_1 = klawisz.nextInt();

        System.out.print("Jaką ocene dostałes z 2 testu? ");
        int ocena_2 = klawisz.nextInt();

        System.out.print("Jaką ocene dostałes z 3 testu? ");
        int ocena_3 = klawisz.nextInt();

        double suma = ocena_1+ocena_2+ocena_3;
        double srednia = suma/3;
        System.out.print("Ocena z pierwszego testu: "+ ocena_1 +"\n"+
                "Ocena z drugiego testu: "+ ocena_1 +"\n"+
                "Ocena z trzeciego testu: "+ ocena_1 +"\n"+
                "Srednia z wszystkich testów: "+ srednia);
    }
}

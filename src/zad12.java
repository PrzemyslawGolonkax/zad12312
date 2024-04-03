import java.util.Scanner;
public class zad12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Ile przejechałeś km?");
        double przejechane_kilometry = klawisz.nextDouble();

        System.out.print("Ile litrów paliwa zużyłeś?");
        double litry = klawisz.nextDouble();
        double km_na_litr = przejechane_kilometry/litry;

        System.out.print("Na jednym litrze paliwa jechałeś średnio: "+
                            km_na_litr+ " km");


    }
}

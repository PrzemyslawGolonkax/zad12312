import java.util.Scanner;
public class zad17 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Ile kosztował posiłek? ");
        double cena_posilku = klawisz.nextDouble();

        double podatek = cena_posilku * 0.0675;
        double suma_ceny_i_podatku = cena_posilku + podatek;
        double napiwek = suma_ceny_i_podatku * 0.20;

        System.out.print("Cena posiłku: " + cena_posilku+ " zł"+ " \n"+
                         "Podatek: " + podatek+ " zł"+ " \n"+
                         "Napiwek: " + napiwek+ " zł"+ " \n");
    }
}

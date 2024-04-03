import java.util.Scanner;
public class zad11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj wartość netto produktu");
        double wartosc_netto = klawisz.nextDouble();

        double podatek_stanowy = wartosc_netto * 0.04;
        double podatek_lokalny = wartosc_netto * 0.02;
        double wartosc_brutto = wartosc_netto + podatek_lokalny +
                podatek_stanowy;
        System.out.print("Wartość netto produktu to: "
                + wartosc_netto + "zł "+"\n"+
                "Podatek stanowy to: "
                + podatek_stanowy + "zł "+"\n"+
                "Podatek lokalny  produktu to: "
                +podatek_lokalny + "zł "+"\n"+
                "Wartość brutto produktu to: "
                + wartosc_brutto + "zł "+"\n");

    }
}


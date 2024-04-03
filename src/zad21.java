import java.util.Scanner;
public class zad21 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Wprowadz kwote początkowo zdeponowaną");
        int kwota_pocz = klawisz.nextInt();
        klawisz.nextLine();

        System.out.print("Wprowadz roczną stope oprocentowania");
        double stopa = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.print("Wprowadz ile razy w roku odsetki są kapitalizowane \n " +
                        "np. przy kapitalizacji miesięcznej wpisz 12 "+","+"\n"+
                        "a przy kapitalizacji kwartalnej wpisz 4 ");
        int ilosc_odsetek = klawisz.nextInt();
        klawisz.nextLine();

        System.out.print("Wprowadz ilosc lat przez jakie srodki bedą \n" +
                        "znajdowac sie na koncie.");
        int ilosc_lat = klawisz.nextInt();
        klawisz.nextLine();
        double potega = Math.pow((1+stopa/ilosc_odsetek), ilosc_lat*ilosc_odsetek);
      double stan_konta = kwota_pocz*potega;

      System.out.print("Twój koncowy stan konta po " +ilosc_lat+" latach to: " +stan_konta);








    }
}

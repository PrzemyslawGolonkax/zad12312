import java.util.Scanner;
public class zad20 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        double cukier = 1.5/48;
        double maslo = 1.0/48;
        double maka = 2.75/48;

        System.out.print("Ile chcesz upiec ciasteczek: ");
        int ilosc_ciasteczek = klawisz.nextInt();
        klawisz.nextLine();


        double cukier_szklanki = cukier *ilosc_ciasteczek;
        double maslo_szklanki = maslo *ilosc_ciasteczek;
        double maka_szklanki = maka *ilosc_ciasteczek;

        System.out.print("Do upieczenia tej ilosci ciasteczek " +
                        "potrzebujesz: "+cukier_szklanki+" szklanek cukru" +", "+
                        maslo_szklanki + " szklanek masła i "+ maka_szklanki +" szklanek maki.");


    }
}

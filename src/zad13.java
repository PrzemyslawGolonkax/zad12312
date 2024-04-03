import java.util.Scanner;
public class zad13 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner (System.in);
        int kcal_na_ciastko = 3000/40;
        System.out.print("Ilosc kalorii na ciastko: "+ kcal_na_ciastko+"\n");
        System.out.print("Ile zjadłeś ciasteczek?");
        int ilosc_zjedzonych_ciasteczek = klawisz.nextInt();

        int ilosc_kcal = kcal_na_ciastko * ilosc_zjedzonych_ciasteczek;
        System.out.print("Zjadłeś "+ilosc_kcal+" kcal");
    }
}


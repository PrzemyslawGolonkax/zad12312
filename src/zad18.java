import java.util.Scanner;
public class zad18 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        double cena_bez_prowizji =600*21.77;
        double prowizja = cena_bez_prowizji * 0.02;
        double cena_calkowita = cena_bez_prowizji * prowizja;

        System.out.print("Cena akcji bez prowizji: "+cena_bez_prowizji+" \n"+
                         "Prowizja: "+prowizja+" \n"+
                         "Cena calkowita: "+cena_calkowita+" \n");
    }
}

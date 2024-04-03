import java.util.Scanner;
public class zad15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner (System.in);

        System.out.print("Jaka jest cena detaliczna płytki? ");
        int cena_detaliczna = klawisz.nextInt();

        double zysk = cena_detaliczna * 0.4;
        System.out.print("Cena detaliczna wynosi: "+ cena_detaliczna+ " zł " +
                        "Zysk wynosi: "+zysk);
    }
}

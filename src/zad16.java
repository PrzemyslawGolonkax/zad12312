import java.util.Scanner;
public class zad16 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Nazwa ulubionego miasta? ");
        String nazwa = klawisz.nextLine();

        int dlugosc = nazwa.length();
        String duze = nazwa.toUpperCase();
        String male = nazwa.toLowerCase();
        char inicja = nazwa.charAt(0);

        System.out.print("liczba znakow w nazwie miasta: "+ dlugosc+"\n"+
                        duze+" \n"+
                        male+" \n"+
                        inicja+" \n");
    }


}

import java.util.Scanner;
public class zad22 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double kwota_za_akcje = 1000*32.87;
        double prowizja_brookera = kwota_za_akcje*0.02;
        double kwota_ze_sprzedazy = 1000*33.92;
        double prowizja_druga = kwota_ze_sprzedazy*0.02;
        double kwota_jeden = kwota_za_akcje - prowizja_brookera;
        double kwota_dwa = kwota_ze_sprzedazy - prowizja_druga;
        double zysk = kwota_jeden - kwota_dwa;
        System.out.print("Kwota zapłacona za akcje: "+kwota_za_akcje
                          +" Prowzja pierwsza:"+prowizja_brookera+ " \n"+
                        "Kwota otrzymana przez Jacka ze sprzedaży: "+
                        kwota_ze_sprzedazy+"Prowizja brookera przy sprzedaży: "+
                        prowizja_druga+"Zysk: "+zysk);
    }
}

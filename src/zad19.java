
public class zad19 {
    public static void main(String[] args) {

        int liczba_konsumentow = 12467;
        double jeden_napoj = 12467 * 0.014;
        double cytrus = jeden_napoj *0.64;

        System.out.print("Przybliżona ilosc osób pijąca napoje energetyczne przynajmmiej " +
                         "raz w tygodniu: "+jeden_napoj + "\n"+
                        "Tyle konsumentów wybiera smak cytrusowy(w przybliżeniu): "
                        +cytrus);
    }
}

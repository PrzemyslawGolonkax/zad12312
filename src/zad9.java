import java.util.Scanner;
public class zad9 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj swoje imie: ");
        String name  = klawisz.nextLine();


        System.out.print("Podaj swój wiek: ");
        int age = klawisz.nextInt();
        klawisz.nextLine();

        System.out.print("Podaj swój oczekiwany roczny dochód: ");
        double annualPay = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.print("Nazywam sie: " + name + "," +
                         " mam " + age + " lat" + "\n" +
                "i chcę zarabiać: " + annualPay +" złotych"+"\n");
    }
}

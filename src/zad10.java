import java.util.Scanner;
public class zad10 {
    public static void main(String[] args) {
Scanner klawisz = new Scanner(System.in);
System.out.print("Jak masz na imie: ");
String first_name = klawisz.nextLine();

System.out.print("Jak masz na drugie imie: ");
String middle_name = klawisz.nextLine();

System.out.print("Jak masz na nazwisko: ");
String Last_name = klawisz.nextLine();

char first_initial = first_name.charAt(0);
char middle_initial = middle_name.charAt(0);
char Last_initial = Last_name.charAt(0);

System.out.print("Masz na imie: "+ first_name + "\n" +
                 "Twoje drugie imie to : "+ middle_name +"\n" +
                "Masz na nazwisko: "+ Last_name + "\n" +
                "Twoje inicjały to: "+ first_initial+"." +
                middle_initial+"."+Last_initial);
    }
}

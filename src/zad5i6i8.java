import java.util.Scanner;
public class zad5i6i8 {
    public static void main(String[] args) {
    Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj długość pierwszego pokoju: ");
        double szer_1_pokoju = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.print("Podaj szerokość pierwszego pokoju: ");
        double dlug_1_pokoju = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.print("Podaj długość drugiego pokoju: ");
        double szer_2_pokoju = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.print("Podaj szerokość drugiego pokoju: ");
        double dlug_2_pokoju = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.print("Podaj długość trzeciego pokoju: ");
        double szer_3_pokoju = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.print("Podaj szerokość trzeciego pokoju: ");
        double dlug_3_pokoju = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.print("Podaj długość czwartego pokoju: ");
        double szer_4_pokoju = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.print("Podaj trzeciego czwartego pokoju: ");
        double dlug_4_pokoju = klawisz.nextDouble();
        klawisz.nextLine();




        double  room1=  dlug_1_pokoju * szer_1_pokoju;
        double room2 = dlug_2_pokoju*szer_1_pokoju;
        double room3 = dlug_3_pokoju*szer_3_pokoju;
        double room4 = dlug_4_pokoju*szer_4_pokoju;
        double all = room1 +room2+ room3+room4;
        double one_person = all/4;
        System.out.print("Wymiary poszczególnych pokoi: \n" +
                "Pokój 1: " + room1 +" m2" +"\n"+
                "Pokój 2: " + room2 +" m2" +"\n"+
                "Pokój 3: " + room3 +" m2" +"\n"+
                "Pokój 4: " + room4 +" m2" +"\n"+
                "Wymiary całego mieszkania: "+ all +" m2"+"\n"+
                "Powierzchnia na jedną osobe: "+ one_person + " m2");
    }
}
public class Zmienne {
    public static void main(String[] args) {

        int liczba;
        liczba = 17;

        double liczba2;
        liczba2 = 0.7;

        double wynik = liczba + liczba2;

        System.out.println("Moje liczby " + wynik);

        int liczba3;

        liczba3 = (int)liczba2;

        double liczba4;
        liczba4 = liczba;

        System.out.println(liczba3);

        int godziny = 8;
        int days = 5;
        int weeks = 52;

        int workHoursPerYear = godziny * days * weeks;

        System.out.println(workHoursPerYear);


        String napis = "Dzisiaj jest \"ładnie\" ";
        napis += ".";

        System.out.println(napis);
        System.out.print(napis+ " \n");
        System.out.print("Mój napis: \n" + napis);

        char litera = '*';

        boolean slonce = true; //false

    }
}

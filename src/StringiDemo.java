public class StringiDemo {
    public static void main(String[] args) {

        String imie;
        imie = "Franciszek";

        int dlugosc = imie.length();

        char inicjal = imie.charAt(3);

        String duze, male;

        male = imie.toLowerCase();
        duze = imie.toUpperCase();

        System.out.println(imie);

    }
}

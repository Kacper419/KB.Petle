import java.util.Scanner;

public class zad23 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner( System.in);
        int R;
        System.out.println("Podaj dlugosc rzedu: ");
        R = klawiatura.nextInt();

        int E;
        System.out.println("Podaj Ilosc Miejsca: ");
        E = klawiatura.nextInt();

        int S;
        System.out.println("Podaj ogleglosc miedzy sadzonkami: ");
        S = klawiatura.nextInt();

        int obliczanie = (R-(2*E)) /S;
        System.out.println("liczba sadzonek w rzedzie to "+ obliczanie );
        System.out.println("Dlugosc rzedu to "+ R );
        System.out.println("Ilosc Miejsca to"+ E );
        System.out.println("ogleglosc miedzy sadzonkami to "+ S);

    }
}

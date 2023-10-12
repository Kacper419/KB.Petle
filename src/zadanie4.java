import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int dni;
        while (true) {
            System.out.print("Podaj liczbę przepracowanych dni): ");
            dni = klawiatura.nextInt();
            if (dni >= 1) {
                break;
            } else {
                System.out.println("Liczba dni musi być co najmniej 1.");
            }
        }
        double zarobek = 0.01;
        double suma = 0.0;
        System.out.println("Dzień\tZarobek (zł)");
        for (int dzien = 1; dzien <= dni; dzien++) {
            System.out.println(dzien + "\t\t" + String.format("%.2f", zarobek));
            suma += zarobek;
            zarobek *= 2; /
        }
        System.out.println("Suma zarobku za " + dni + " dni wynosi: " + String.format("%.2f", suma) + " zł");
    }
}
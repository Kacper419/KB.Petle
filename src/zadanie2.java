import java.util.Scanner;
public class zadanie2 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        int  droga, szybkosc, czas ;

        System.out.println("Podaj szybkość drogi");
        szybkosc= klawiatura.nextInt();

        System.out.println("czas drogi");
        czas= klawiatura.nextInt();

        droga=szybkosc*czas;


        for (int i = 1;  i<=czas; i++) {
            droga += 1;
        }

        system.out.printl("odleglosc przebyta to" + droga + "");


    }
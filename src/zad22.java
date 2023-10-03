public class zad22 {
    public static void main(String[] args) {
      double akcje;
      akcje=1000;

      double jednaakcja = 32.87;

        double prowizja;
        prowizja =2;

        double  sumaakcji = (akcje * jednaakcja);
        double sumaprowizji = (sumaakcji*prowizja) /100;
        double finalnasuma =(sumaakcji-sumaprowizji);
        System.out.println("Jacek Zaplacil " +finalnasuma);
        System.out.println("Prowizja Jacka przy zakupie to "   +sumaprowizji);



        double sprzedaneakcje;
        sprzedaneakcje = 1000;

        double cenasprzedanejakcji;
        cenasprzedanejakcji=33.92;

        double prowizjasprzedarzy;
        prowizjasprzedarzy=2;

        double sumasprzeakcji = (sprzedaneakcje*cenasprzedanejakcji);
        double sumasprzeprowizji = (sumasprzeakcji*prowizjasprzedarzy) /100;
        double finalnasumasprzedary = (sumasprzeakcji-sumasprzeprowizji);
        System.out.println("Jacek zarobił " +finalnasumasprzedary);
        System.out.println("prowizja Jacka przy sprzedaniu " +sumasprzeprowizji);

        double zysk =(finalnasumasprzedary-finalnasuma);
        System.out.println("Jacek zarobił łącznie " +zysk);








    }
}

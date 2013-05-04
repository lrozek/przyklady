package pl.lrozek.szkolenia.wprowadzenie.oop.referencje;

public class PrzekazywaniePrymitymowPrzezWartoscMain {

    public static void main( String[] args ) {
        int liczba = 10;
        zrobCosZLiczba( liczba );
        System.out.println( liczba );

    }

    private static void zrobCosZLiczba( int liczba ) {
        liczba = liczba + 5;
        System.out.println( liczba );
    }

}

package pl.lrozek.szkolenia.wprowadzenie.oop.referencje;

public class PrzekazywaniePrymitymowPrzezWartoscMain {

    public static void main( String[] args ) {
        int liczba = 10;
        zrobCosZLiczba( liczba );
        System.out.println( liczba );

    }

    private static int zrobCosZLiczba( int liczba ) {
        liczba = liczba + 5;
        if ( liczba > 10 ) {
            System.out.println( liczba );
            return liczba;
        }
        System.out.println( liczba );
        return liczba;
    }

}

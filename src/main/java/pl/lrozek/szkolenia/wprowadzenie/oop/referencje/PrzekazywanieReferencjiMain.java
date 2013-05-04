package pl.lrozek.szkolenia.wprowadzenie.oop.referencje;

public class PrzekazywanieReferencjiMain {

    public static void main( String[] args ) {
        Osoba osoba = new Osoba();
        osoba.setName( "Jozek" );
        osoba.wypiszImie();
        zrobCosZObiektem( osoba );
        osoba.wypiszImie();
    }

    public static void zrobCosZObiektem( Osoba osoba ) {
        osoba.setName( "Zbyszek" );
    }

}
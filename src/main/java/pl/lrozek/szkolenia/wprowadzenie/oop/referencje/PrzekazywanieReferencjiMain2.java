package pl.lrozek.szkolenia.wprowadzenie.oop.referencje;

public class PrzekazywanieReferencjiMain2 {

    public static void main( String[] args ) {
        Osoba osoba = new Osoba();
        osoba.setName( new String( "Jozek" ) );
        osoba.wypiszImie();
        zrobCosZObiektem( osoba );
        osoba.wypiszImie();
    }

    public static void zrobCosZObiektem( Osoba osoba ) {
        osoba = new Osoba();
        String name = new String( "Zbyszek" );
        osoba.setName( name );
    }
}

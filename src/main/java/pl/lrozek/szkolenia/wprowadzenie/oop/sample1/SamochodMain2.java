package pl.lrozek.szkolenia.wprowadzenie.oop.sample1;

public class SamochodMain2 {

    public static void main( String[] args ) {
        Samochod samochod1 = new Samochod( "abc123" );
        Samochod samochod2 = new Samochod( "abc123" );
        Samochod samochod3 = new Samochod( "xyz987" );

        System.out.println( "samochod1 == samochod2 " + ( samochod1 == samochod2 ) );
        System.out.println( "samochod1 equals samochod2 " + ( samochod1.equals( samochod2 ) ) );

        System.out.println( "\n" );

        System.out.println( "samochod1 == samochod3 " + ( samochod1 == samochod3 ) );
        System.out.println( "samochod1 equals samochod3 " + ( samochod1.equals( samochod3 ) ) );
    }

}

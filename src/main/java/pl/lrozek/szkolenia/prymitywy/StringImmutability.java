package pl.lrozek.szkolenia.prymitywy;

public class StringImmutability {

    public static void main( String[] args ) {
        String name = new String( "Zbyszek" );
        String nameWithSurname = name.concat( new String( " Kowalski" ) );
        System.out.println( name );
        System.out.println( nameWithSurname );

    }

}

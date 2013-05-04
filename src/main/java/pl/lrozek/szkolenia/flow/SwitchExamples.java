package pl.lrozek.szkolenia.flow;

import static pl.lrozek.szkolenia.flow.DzienTygodnia.PONIEDZIALEK;
import static pl.lrozek.szkolenia.flow.DzienTygodnia.SRODA;

public class SwitchExamples {

    public static void main( String[] args ) {
        enumSwitch( PONIEDZIALEK );
        enumSwitch( SRODA );
        enumString( "ponniedzialek" );
        enumInt( 1 );
    }

    private static void enumInt( int dzienTygodnia ) {
        switch ( dzienTygodnia ) {
            case 0:
                System.out.println( "pon" );
                break;
            case 1:
                System.out.println( "wtorek" );
                break;
            default:
                System.out.println( "nieznany dzien" );
                break;
        }
    }

    private static void enumString( String dzienTygodnia ) {
        switch ( dzienTygodnia ) {
            case "poniedzialek":
                System.out.println( "pon" );
                break;
            case "wtorek":
                System.out.println( "wtorek" );
                break;
            default:
                System.out.println( "nieznany dzien" );
                break;
        }
    }

    private static void enumSwitch( DzienTygodnia dzienTygodnia ) {
        switch ( dzienTygodnia ) {
            case PONIEDZIALEK:
                System.out.println( "pon" );
                break;
            case WTOREK:
                System.out.println( "wtorek" );
                break;
            default:
                System.out.println( "nieznany dzien" );
                break;
        }

    }

}

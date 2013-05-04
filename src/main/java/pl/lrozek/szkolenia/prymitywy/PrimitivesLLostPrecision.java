package pl.lrozek.szkolenia.prymitywy;

import java.math.BigDecimal;

public class PrimitivesLLostPrecision {

    public static void main( String[] args ) {
        dodawanieDoubli();
        dodawanieBigDecimali();

    }

    /**
     * omowic czemu jako string a nie double
     */
    private static void dodawanieBigDecimali() {
        BigDecimal bd1 = new BigDecimal( "5.6" );
        BigDecimal bd2 = new BigDecimal( "5.8" );
        System.out.println( "suma floatow " + bd1.add( bd2 ).toString() );
    }

    private static void dodawanieDoubli() {
        double d1 = 5.6;
        double d2 = 5.8;
        System.out.println( "suma doubli " + ( d1 + d2 ) );
    }

}

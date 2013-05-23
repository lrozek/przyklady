package pl.lrozek.szkolenia.prymitywy;

import java.math.BigDecimal;

public class BigDecimalImmutability {

    public static void main( String[] args ) {
        BigDecimal bigDecimal = new BigDecimal( "15.15" );
        BigDecimal result = bigDecimal.add( new BigDecimal( "5" ) );
        System.out.println( bigDecimal );
        System.out.println( result );
    }

}

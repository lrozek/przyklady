package pl.lrozek.szkolenia.variables;

import pl.lrozek.szkolenia.prymitywy.overloading.Money;

public class VariablesMain {

    public static void main( String[] args ) {
        Money money = new Money( 10f );
        Money money2 = money;
        money2.setValue( 11f );
        money.setValue( 10f );
        new Money( 13 );
        new Money( 14 );
        System.out.println( money.getValue() );
        System.out.println( money2.getValue() );
    }

}

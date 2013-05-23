package pl.lrozek.szkolenia.prymitywy.overloading;

public class MoneyMain {

    public static void main( String[] args ) {
        Money money = new Money( 100.10f );
        Money money2 = new Money( 100.12f );

        money.add( money2 );
        System.out.println( money.getValue() );

    }
}

package pl.lrozek.szkolenia.operatory;

public class ShortOperator {

    public static void main( String[] args ) {
        shortOp();
        full();
    }

    private static void shortOp() {
        boolean result = ( returnTrue() || returnNull() );
        System.out.println( result );
    }

    private static void full() {
        boolean result = ( returnTrue() | returnNull() );
        System.out.println( result );
    }

    public static boolean returnTrue() {
        return true;
    }

    public static Boolean returnNull() {
        return null;
    }

}

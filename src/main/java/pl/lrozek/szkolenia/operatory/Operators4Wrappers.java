package pl.lrozek.szkolenia.operatory;

public class Operators4Wrappers {

    /**
     * Integer.valueOf( val1.intValue() + val2.intValue() );
     * uboxing & boxing
     */
    public static void main( String[] args ) {
        Integer val1 = 5;
        Integer val2 = 10;
        Integer val3 = 15;
        Integer result;
        result = val1 + val2;
        System.out.println( result );
        System.out.println( result == val3 );
        System.out.println( result.equals( val3 ) );
    }
}

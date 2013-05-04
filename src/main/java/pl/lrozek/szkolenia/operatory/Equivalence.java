package pl.lrozek.szkolenia.operatory;

public class Equivalence {
    public static void main( String[] args ) {
        noCache();
        withCache();
        primitives();
    }

    private static void primitives() {
        System.out.println( "primitives" );
        int n1 = 57;
        int n2 = 57;
        System.out.println( n1 == n2 );
        System.out.println( n1 != n2 );
    }

    private static void noCache() {
        System.out.println( "noCache" );
        Integer n1 = new Integer( 57 );
        Integer n2 = new Integer( 57 );
        System.out.println( n1 == n2 );
        System.out.println( n1 != n2 );
        System.out.println( n1.equals( n2 ) );
    }

    private static void withCache() {
        System.out.println( "withCache" );
        Integer n1 = 57;
        Integer n2 = 57;
        System.out.println( n1 == n2 );
        System.out.println( n1 != n2 );
        System.out.println( n1.equals( n2 ) );
    }

}

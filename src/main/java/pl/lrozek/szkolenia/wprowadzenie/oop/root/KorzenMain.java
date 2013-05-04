package pl.lrozek.szkolenia.wprowadzenie.oop.root;

public class KorzenMain {

    /**
     * omowic pozostale publiczne:
     * - wait*
     * - notify*
     * 
     *  omowic protected
     *  - clone
     *  - finalize
     */
    public static void main( String[] args ) {
        PustaKlasa pk1 = new PustaKlasa();
        PustaKlasa pk2 = new PustaKlasa();
        System.out.println( "pk1 instanceof Object: " + pk1 instanceof Object );
        System.out.println( "pk1.hashCode: " + pk1.hashCode() );
        System.out.println( "pk1.toString(): " + pk1.toString() );
        System.out.println( "pk1.equals( pk2 ): " + pk1.equals( pk2 ) );
        System.out.println( "pk1.equals( pk1 ): " + pk1.equals( pk1 ) );
        System.out.println( "pk1.getClass(): " + pk1.getClass() );
    }
}

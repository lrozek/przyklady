package pl.lrozek.szkolenia.prymitywy;

public class Caching {

    public static void main( String[] args ) {
        cached();
        nonCached();

    }

    private static void cached() {
        Integer l1 = 215; //boxing occurs, from small int to big int (Integer)
        int l2 = 215; //boxing occurs, from small int to big int (Integer)

        System.out.println( l1 == l2 ); //l1 is unboxed, from big int (Integer) to small int
        System.out.println( l1.equals( l2 ) );// l2 is boxed, from small int to big int (Integer)
    }

    private static void nonCached() {
        Integer l1 = 15;
        int l2 = 15;

        System.out.println( l1 == l2 );
        System.out.println( l1.equals( l2 ) );
    }
}

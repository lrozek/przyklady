package pl.lrozek.szkolenia.prymitywy;

public class AutoboxingPuzzlers {

    public static void main( String[] args ) {
        cached();
        nonCached();
        cachedUnboxing();
        nonCachedUnboxing();
        npe();
    }

    private static void cachedUnboxing() {
        Integer integer1 = 100;
        Integer integer2 = 100;
        System.out.println( integer1 <= integer2 );
        System.out.println( integer1 >= integer2 );
        System.out.println( integer1 == integer2 );

    }

    private static void nonCachedUnboxing() {
        Integer integer1 = 100; //boxing
        Integer integer2 = 100; //boxing
        System.out.println( integer1 <= integer2 ); //unboxing
        System.out.println( integer1 >= integer2 ); //unboxing
        System.out.println( integer1 == integer2 ); //reference comparision

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

    private static void npe() {
        Boolean boolean1 = null;
        boolean boolean2 = false;
        System.out.println( boolean1 == boolean2 );
    }
}

package pl.lrozek.szkolenia.flow;

public class ForEach {

    public static void main( String[] args ) {
        int[] inty = new int[5];
        forArray( inty );
        forEachArray( inty );
    }

    private static void forArray( int[] inty ) {
        for ( int index = 0; index < inty.length; index++ ) {
            System.out.println( inty[index] );
        }
    }

    private static void forEachArray( int[] inty ) {
        for ( int val : inty ) {
            System.out.println( val );
        }

    }

}

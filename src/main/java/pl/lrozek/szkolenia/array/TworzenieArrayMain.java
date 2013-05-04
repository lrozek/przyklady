package pl.lrozek.szkolenia.array;

public class TworzenieArrayMain {

    public static void main( String[] args ) {
        int[] liczby = new int[5];
        pokazInicjalizacje( liczby );
        probaPisaniaPoPamieci( liczby );
    }

    private static void probaPisaniaPoPamieci( int[] liczby ) {
        for ( int index = 0; index < liczby.length + 1; index++ ) {
            liczby[index] = index;
            System.out.println( "liczby[" + index + "]=" + liczby[index] );
        }
    }

    private static void pokazInicjalizacje( int[] liczby ) {
        for ( int index = 0; index < liczby.length; index++ ) {
            System.out.println( "liczby[" + index + "]=" + liczby[index] );
        }
    }
}

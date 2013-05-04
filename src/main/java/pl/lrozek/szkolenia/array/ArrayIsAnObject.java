package pl.lrozek.szkolenia.array;

public class ArrayIsAnObject {

    public static void main( String[] args ) {
        String array[] = { "Ala", "ma", "kota" };

        System.out.println( "array.toString(): " + array.toString() );
        System.out.println( "array.hashCode(): " + array.hashCode() );
        System.out.println( "array.getClass(): " + array.getClass() );
    }

}

package pl.lrozek.szkolenia.array;

import java.util.Arrays;

public class ArrayIsAnObject {

    public static void main( String[] args ) {
        String array[] = { "Ala", "ma", "kota" };
        String array1[] = { "Ala", "ma", "kota", null };

        System.out.println( array == array1 );
        System.out.println( Arrays.equals( array, array1 ) );

    }

}

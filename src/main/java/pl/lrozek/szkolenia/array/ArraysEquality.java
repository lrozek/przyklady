package pl.lrozek.szkolenia.array;

public class ArraysEquality {

    public static void main( String[] args ) {
        String miasta1[] = { "Szczecin", "Krakow" };
        String miasta2[] = { "Szczecin", "Krakow" };
        System.out.println( "miasta1.hashCode(): " + miasta1.hashCode() );
        System.out.println( "miasta2.hashCode(): " + miasta2.hashCode() );
        System.out.println( "miasta2.equals( miasta1 ): " + miasta2.equals( miasta1 ) );
    }

}

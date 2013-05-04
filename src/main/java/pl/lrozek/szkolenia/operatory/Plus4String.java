package pl.lrozek.szkolenia.operatory;

public class Plus4String {

    public static void main( String[] args ) {
        concatenate1();
        concatenate2();
    }

    /**
     * new StringBuilder( imie ).append( nazwisko ).toString();
     */
    private static void concatenate1() {
        String imie = "Jan ";
        String nazwisko = "Kowalski";
        System.out.println( imie + nazwisko );
    }

    /**
     * tak samo dziala +=
     */
    private static void concatenate2() {
        String imie = "Jan ";
        String nazwisko = "Kowalski";
        imie += nazwisko;
        System.out.println( imie );
    }

}

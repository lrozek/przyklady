package pl.lrozek.szkolenia.oop.inicjalizacja;

public class InicjalizacjaWKlasie {

    private String name = "Zbyszek";

    public InicjalizacjaWKlasie() {
        System.out.println( "constructor" );
        name = "Jan";
    }

    public InicjalizacjaWKlasie( String name ) {
        System.out.println( "overloaded constructor" );
        this.name = name;
    }

    {
        System.out.println( "init block" );
        name = "Adam";
    }

    @Override
    public String toString() {
        return "InicjalizacjaWKlasie [name=" + name + "]";
    }

    public static void main( String[] args ) {
        System.out.println( new InicjalizacjaWKlasie() );
        System.out.println( new InicjalizacjaWKlasie( "Robert" ) );
    }
}

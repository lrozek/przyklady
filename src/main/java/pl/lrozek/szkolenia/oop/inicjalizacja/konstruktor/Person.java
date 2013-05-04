package pl.lrozek.szkolenia.oop.inicjalizacja.konstruktor;

public class Person {

    private String name;

    public Person( String name ) {
        super();
        this.name = name;
    }

    public Person() {
        this( "Jan" );
    }

    public void introduce() {
        System.out.println( "Jestem " + name );
    }

}

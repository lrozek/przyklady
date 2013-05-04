package pl.lrozek.szkolenia.oop.inicjalizacja.konstruktor;

public class PersonMain {

    public static void main( String[] args ) {
        Person p1 = new Person();
        Person p2 = new Person( "Marcin" );
        p1.introduce();
        p2.introduce();
    }

}

package pl.lrozek.szkolenia.wprowadzenie.oop.referencje;

public class Osoba {

    private String name;

    public void setName( String name ) {
        this.name = name;
    }

    public void wypiszImie() {
        System.out.println( "moje imie to " + name );
    }

}

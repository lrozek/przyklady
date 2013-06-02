package pl.lrozek.szkolenia.oop.inicjalizacja.hierarchia;

public class BaseClass {

    private String baseName = "ZbyszekBase";

    {
        System.out.println( "base init block" );
        baseName = "JanBase";
    }

    public BaseClass() {
        System.out.println( "base constructor" );
        baseName = "TomaszBase";
    }

    public void greetBase() {
        System.out.println( baseName );
    }

}

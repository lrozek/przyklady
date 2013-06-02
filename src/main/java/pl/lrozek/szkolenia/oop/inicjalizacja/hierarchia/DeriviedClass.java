package pl.lrozek.szkolenia.oop.inicjalizacja.hierarchia;

public class DeriviedClass extends BaseClass {

    private String deriviedName = "deriviedZbyszek";

    {
        System.out.println( "derivied init block" );
        deriviedName = "deriviedJan";
    }

    public DeriviedClass() {
        System.out.println( "derivied constructor" );
        deriviedName = "TomaszDerivied";
    }

    public void deriviedGreet() {
        System.out.println( deriviedName );
    }

}

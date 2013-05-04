package pl.lrozek.szkolenia.wprowadzenie.oop.dziedziczenie;

public class ZwierzetaMain {

    public static void main( String[] args ) {
        Zwierze zwierze1 = new Pies();
        Zwierze zwierze2 = new Kot();
        Zwierze zwierze3 = new Bociek();

        zwierze1.dajGlos();
        zwierze2.dajGlos();
        zwierze3.dajGlos();
    }

}

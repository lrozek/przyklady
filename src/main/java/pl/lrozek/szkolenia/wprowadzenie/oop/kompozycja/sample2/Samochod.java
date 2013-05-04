package pl.lrozek.szkolenia.wprowadzenie.oop.kompozycja.sample2;

/**
 * 
 * samochod ma (posiada) silink (has a)
 */
public class Samochod {

    private Silnik silnik;

    /**
     *  konstruktor samochodu. Wstrzykiwany jest silnik do samochodu silnik
     *  - luzne powiazanie samochodu z silnikiem
     *  - samochod moze dostac rozne silniki: diesel, benzyna, gaz, itd
     *  - mozna silniki wymieniam w runtimie
     */
    public Samochod( Silnik silnik ) {
        this.silnik = silnik;
    }

}

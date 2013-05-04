package pl.lrozek.szkolenia.oop.struktura;

public class StrukturaKlasy {

    /**
     * sygnatura metody:
     *  - zakres widocznosci
     *  - typ zwracany (mozna zwrocic tylko jeden typ)
     *      - slowo kluczowe return
     *  - nazwa
     *  - lista parametrow 
     *  
     *  
     *  
     *  metody mozna wywolywac na rzecz obiektow
     *  metody sa skladowa klasy
     */
    public String nazwaMetody( String argumentMetody ) {
        return argumentMetody;
    }

    /**
     * void 
     */
    public void metodaKtoraNicNieZwraca( String argumentMetody ) {
        argumentMetody.concat( "doklej" );
    }

}

package pl.lrozek.szkolenia.oop.inheritance.upcasting;

public class UpcastingMain {

    public static void main( String[] args ) {
        NumberFactory numberFactory = new NumberFactory();
        Number number = numberFactory.getNumber();
        int intValue = number.intValue();
        System.out.println( intValue );
    }

}

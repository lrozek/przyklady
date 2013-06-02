package pl.lrozek.szkolenia.exception;

public class UnHandledExceptionMain {

    public static void main( String[] args ) {
        ExceptionThrower exceptionThrower = new ExceptionThrower();
        System.out.println( "before dangerous method" );
        exceptionThrower.doSomeStaff();
        System.out.println( "after dangerous method" );
    }

}

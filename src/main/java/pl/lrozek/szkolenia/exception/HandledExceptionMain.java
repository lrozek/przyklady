package pl.lrozek.szkolenia.exception;

public class HandledExceptionMain {

    public static void main( String[] args ) {
        try { // try block
            ExceptionThrower exceptionThrower = new ExceptionThrower();
            System.out.println( "before dangerous method" );
            exceptionThrower.doSomeStaff();
            System.out.println( "after dangerous method" );
        }
        catch ( IllegalStateException e ) { //optional block
            System.out.println( "in IllegalStateException catch block" );
            e.printStackTrace( System.out );
        }
        catch ( RuntimeException e ) {
            System.out.println( "in RuntimeException catch block" );
            e.printStackTrace( System.out );
        }
        finally { //optional block
            System.out.println( "in finally block" );
        }
        System.out.println( "after guarder region" );
    }

}

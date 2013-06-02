package pl.lrozek.szkolenia.exception;

public class ExceptionThrower {

    public void doSomeStaff() {
        RuntimeException exc = new IllegalStateException( "nothing to Do" );
        throw exc;
    }

}

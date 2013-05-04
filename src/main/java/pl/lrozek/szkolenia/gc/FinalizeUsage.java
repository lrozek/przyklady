package pl.lrozek.szkolenia.gc;

public class FinalizeUsage {

    @Override
    protected void finalize() throws Throwable {
        System.out.println( "clean up of " + hashCode() );
    }

}

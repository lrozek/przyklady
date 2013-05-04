package pl.lrozek.szkolenia.gc;

/**
 * -XX:+PrintGCDetails
 */
public class GCMain {

    public static void main( String[] args ) {
        FinalizeUsage fu1 = new FinalizeUsage();
        FinalizeUsage fu2 = new FinalizeUsage();
        System.out.println( "fu1 " + fu1.hashCode() );
        fu1 = null;
        System.out.println( "fu2 " + fu2.hashCode() );
        fu2 = null;
        System.out.println();
    }

}

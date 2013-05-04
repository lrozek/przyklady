package pl.lrozek.szkolenia.operatory;

public class PostPre {

    public static void main( String[] args ) {
        pre();
        post();
    }

    private static void post() {
        System.out.println( "post" );
        int i = 10;
        System.out.println( i++ );
        System.out.println( i );
    }

    private static void pre() {
        System.out.println( "pre" );
        int i = 10;
        System.out.println( ++i );
        System.out.println( i );
    }

}

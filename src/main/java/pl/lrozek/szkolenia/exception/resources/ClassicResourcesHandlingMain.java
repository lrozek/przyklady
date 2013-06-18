package pl.lrozek.szkolenia.exception.resources;

import java.io.IOException;
import java.io.InputStream;

public class ClassicResourcesHandlingMain {

    public static void main( String[] args ) {
        InputStream inputStream = null;
        try {
            inputStream = new DummyResource();
            inputStream.read();
        }
        catch ( IOException e ) {
            throw new RuntimeException( e );//chaining | wrapping
        }
        finally {
            if ( null != inputStream ) {

                try {
                    inputStream.close();
                }
                catch ( IOException e ) {
                    throw new RuntimeException( e ); // root exception is swallowed
                }
            }
        }
    }

}

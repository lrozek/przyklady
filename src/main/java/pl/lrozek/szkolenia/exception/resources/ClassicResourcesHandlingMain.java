package pl.lrozek.szkolenia.exception.resources;

import java.io.IOException;
import java.io.InputStream;

public class ClassicResourcesHandlingMain {

    public static void main( String[] args ) throws IOException {
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
                inputStream.close(); //it throw Exception and it isn't handled cause it is declared in main method
            }
        }
    }

}

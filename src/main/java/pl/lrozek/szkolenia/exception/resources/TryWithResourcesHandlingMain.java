package pl.lrozek.szkolenia.exception.resources;

import java.io.IOException;
import java.io.InputStream;

public class TryWithResourcesHandlingMain {

    public static void main( String[] args ) {
        try (InputStream inputStream = new DummyResource()) {
            inputStream.read();
        }
        catch ( IOException e ) {
            throw new RuntimeException( e ); //chaining | wrapping
        }
    }

}

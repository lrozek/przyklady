package pl.lrozek.szkolenia.exception.resources;

import java.io.IOException;
import java.io.InputStream;

public class DummyResource extends InputStream {

    @Override
    public int read() throws IOException {
        IOException exception = new IOException( "nothing to read" );
        throw exception;
    }

    @Override
    public void close() throws IOException {
        IOException exception = new IOException( "closing failed" );
        throw exception;
    }

}

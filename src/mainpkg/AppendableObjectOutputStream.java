package mainpkg;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ObjectOutputStream;

class AppendableObjectOutputStream extends ObjectOutputStream{
    public AppendableObjectOutputStream(OutputStream out) throws
IOException{
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException{
    }
    
}
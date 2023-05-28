package Domain.Services;

import java.io.IOException;

public class Escritor {

    public Escritor (IEscritor escritor) throws IOException
    {
        escritor.Escrever();
    }
}

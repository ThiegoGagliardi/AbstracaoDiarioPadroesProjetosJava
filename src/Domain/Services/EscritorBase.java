package Domain.Services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorBase {

    protected File diario;

    protected FileWriter fw;

    public EscritorBase(File diario) throws IOException
    {
       this.diario  =  diario;
       this.fw      =  new FileWriter(diario.getPath(), true);
    }
}

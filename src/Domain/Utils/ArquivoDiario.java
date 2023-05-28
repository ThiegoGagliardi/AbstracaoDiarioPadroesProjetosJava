package Domain.Utils;

import java.io.File;
import java.io.IOException;

public class ArquivoDiario {
    private static class DiarioHolder {

        public static File diario = new File("Diario.txt");
    }
    private ArquivoDiario()
    {
        super();
    }

    public static File getDiario() throws IOException {

        if (!(DiarioHolder.diario.exists()))
        {
            DiarioHolder.diario.createNewFile();
        }
        return DiarioHolder.diario;
    }
}

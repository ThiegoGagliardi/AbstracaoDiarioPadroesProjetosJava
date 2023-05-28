package Domain.Services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Domain.Models.NotasRodape;

public class EscritorNotasRodape extends EscritorBase implements IEscritor {

    private NotasRodape notaRodape;

    public EscritorNotasRodape(File diario, NotasRodape notaRodape) throws IOException
    {
        super(diario);
        this.notaRodape = notaRodape;
    }

    @Override
    public void Escrever() throws IOException {

        fw.write(notaRodape.getData().toString());
        fw.write(";");
        fw.write(notaRodape.getTipoConteudo().toString());
        fw.write(";");
        fw.write(notaRodape.getConteudo().toString());
        fw.write(System.lineSeparator());
        fw.close();
    }
}

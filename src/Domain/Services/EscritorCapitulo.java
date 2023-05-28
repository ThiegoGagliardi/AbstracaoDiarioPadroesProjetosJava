package Domain.Services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Domain.Models.Capitulo;

public class EscritorCapitulo extends EscritorBase implements IEscritor{

    private Capitulo capitulo;

    public EscritorCapitulo(File diario, Capitulo capitulo) throws  IOException
    {
        super(diario);
        this.capitulo = capitulo;
    }

    @Override
    public void Escrever() throws IOException {

        fw.write(capitulo.getDataCapitulo().toString());
        fw.write(";");
        fw.write(capitulo.getTipoConteudo().toString());
        fw.write(";");
        fw.write(capitulo.getAutor());
        fw.write(";");
        fw.write(capitulo.getConteudoCapitulo());
        fw.write(System.lineSeparator());
        fw.close();
    }
}

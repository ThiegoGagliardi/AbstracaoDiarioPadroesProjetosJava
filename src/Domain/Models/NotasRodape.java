package Domain.Models;

import Domain.Services.EscritorCapitulo;
import Domain.Services.EscritorNotasRodape;
import Domain.Services.IEscritor;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class NotasRodape {

    private LocalDate data;
    private String conteudo;

    private TipoConteudo tipo = TipoConteudo.NOTAS_RODAPE;

    public NotasRodape(LocalDate data, String conteudo)
    {
        this.data     = data;
        this.conteudo = conteudo;
    }

    public LocalDate getData()
    {
        return this.data;
    }

    public String getConteudo()
    {
        return conteudo;
    }

    public TipoConteudo getTipoConteudo()
    {
        return this.tipo;
    }

    public IEscritor getEscritor(File diario) throws IOException
    {
        return new EscritorNotasRodape(diario,this );
    }

}

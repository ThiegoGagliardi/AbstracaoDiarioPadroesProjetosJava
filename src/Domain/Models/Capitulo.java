package Domain.Models;

import java.io.File;

import Domain.Services.EscritorCapitulo;
import Domain.Services.IEscritor;

import java.io.IOException;
import java.time.LocalDate;

public class Capitulo {
    private LocalDate dataCapitulo;
    private String conteudoCapitulo;
    private String autor;
    private TipoConteudo tipo = TipoConteudo.CAPITULO;

    public Capitulo(LocalDate dataCapitulo, String conteudoCapitulo, String autor)
    {
        this.dataCapitulo     = dataCapitulo;
        this.conteudoCapitulo = conteudoCapitulo;
        this.autor            = autor;
    }
    public LocalDate getDataCapitulo()
    {
        return this.dataCapitulo;
    }
    public String getConteudoCapitulo()
    {
       return this.conteudoCapitulo;
    }
    public String getAutor()
    {
        return this.autor;
    }
    public TipoConteudo getTipoConteudo()
    {
        return this.tipo;
    }

    public IEscritor getEscritor(File diario) throws IOException
    {
        return new EscritorCapitulo(diario,this );
    }

}

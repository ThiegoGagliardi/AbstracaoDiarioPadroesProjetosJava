import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import Domain.Models.Capitulo;
import Domain.Utils.ArquivoDiario;
import Domain.Services.Escritor;

import Domain.Models.NotasRodape;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Usando Singleton para buscar o arquivo onde será escrito o diário");

        File diario = ArquivoDiario.getDiario();

        System.out.println("Criando um capítulo do diário");

        Capitulo cap = new Capitulo(LocalDate.now(),"Diario escrito a primeira vez","Bob Finger");

        System.out.println("Usando Facade para gravar um capítulo no arquivo");
        new Escritor(cap.getEscritor(diario));

        System.out.println("Criando uma nota de rodape");
        NotasRodape nota = new NotasRodape(LocalDate.now(),"Nota de rodapé");

        System.out.println("Usando o strategy para gravar uma nota de rodapé");
        new Escritor(nota.getEscritor(diario));
    }
}
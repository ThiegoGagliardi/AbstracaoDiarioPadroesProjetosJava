# EXPLORANDO PADRÕES DE PROJETOS COM JAVA
## Desafio de projeto Digital Innovation One.

### Abstração de um diário: 

Basicamente temos as classes de modelos, capítulo e nota de rodapés, que serão salvas no mesmo arquivo "Diario.txt". Temos os Serviços apartados para escrever notas de rodapé e capítulos no mesmo arquivo, tudo isso é flexibilizado pela classe Escritor.

### Padrões de projetos abordados:

1 - Singleton: Classe ArquivoDiario, sempre retorna o mesmo objeto com a abstração do arquivo.

2 - Facade: Classes EscritorCapitulo e EscritorNotasRodape,onde encapsula a complexidade para salvar os Capítulos e as notas de rodapé

3 - Strategy: Classe Escritor, flexibiliza a escrita de capítulos e notas de rodapé
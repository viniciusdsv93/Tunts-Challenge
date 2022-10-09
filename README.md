## Aplicação em Java para ler dados de uma planilha, calcular média de alunos e gerar uma nova planilha com os dados inseridos

### Construído com

-   Java 18.0.1.1

Aplicação destinada à leitura e obtenção de dados a partir de um arquivo de extensão ".xslx" com o intuito de calcular a média de alunos e verificar sua situação.

Conforme a descrição do problema, o programa, ao ser iniciado, inicia a leitura linha a linha da planilha e armazena os dados de cada linha como atributos de uma classe "Student".

A partir desses dados, implementa a funcionalidade "calculateAverageGrade", que também verifica se a quantidade de faltas é maior do que o limite.

Caso o número de faltas não ultrapasse 25% do número total de aulas, é verificada a média das três notas do aluno.

Verificada sua média, é então atribuída a sua situação, podendo ser "Reprovado por Nota", "Exame Final" ou "Aprovado".

A fim de facilitar a manutenção do código, foi aplicado o conceito da Inversão de Controle por meio da Injeção de Dependência quanto à classe responsável por implementar a regra de negócio a respeito do cálculo da média e verificação da situação do aluno.

No pacote "calculateAverageGrade" foi criada uma interface com o método "calculateAverageGrade". Dentro deste pacote, há a implementação desta interface, onde é aplicada a regra de negócio pertinente à verificação do número de faltas e cálculo de média.

Por sua vez, na classe de leitura do arquivo "ReadSheet", foi inserida como dependência a interface "ICalculateAverageGrade", a qual é injetada por meio do construtor, ou seja, injetada externamente por quem instanciar a classe.

No caso, a classe "Main" é responsável por iniciar a aplicação, instanciar a classe "ReadSheet", injetando em seu construtor a implementação da interface acima descrita.

Desta forma, é possibilitado o desacoplamento entre a classe responsável pela leitura e obtenção de dados e a classe que implementa a regra de negócios quanto ao cálculo da média.

Por fim, é instanciada a classe responsável pela escrita dos dados em uma nova planilha, denominada "Engenharia de Software - Desafio [Vinícius dos Santos Verissimo]2.xlsx", já com os campos de "situação" e "nota faltante" preenchidos.

## Execução

Para executar a aplicação, execute "mvn clean install" e depois o comando (mvn exec:java -D"exec.mainClass"="org.example.Main") no terminal

## Autor

-   GitHub - Vinícius dos Santos Verissimo (https://github.com/viniciusdsv93)

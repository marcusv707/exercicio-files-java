# exercicio-files-java
Exercício sobre manipulação de arquivos em java.

Esse programa lê um arquivo no formato CSV contendo uma lista de produtos, o preço unitário e a quantidade de cada produto. 
Depois, cria um novo arquivo no formato CSV contendo uma lista de produtos e o preço total para cada produto. 

Abaixo temos um exemplo de um arquivo de entrada e o arquivo de saída.

**Arquivo de entrada**
```
TV LED,1290.99,1
Video Game Chair,350.50,3
Iphone X,900.00,2
Smsung Galaxy 9,850.00,2
```
**Arquivo de saída**
```
TV LED,1290.99
Video Game Chair,1051.50
Iphone X,1800.00
Smsung Galaxy 9,1700.00
```

Para usar o programa, é preciso informar o caminho do arquivo de entrada como mostrado no exemplo abaixo:

`c:\temp\input.csv`

Uma nova pasta chamada `\out` será criada no mesmo diretório e o arquivo de saída será criada dentro da pasta `\out` com o nome `summary.csv`.
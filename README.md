# DIO-java-basico
Curso realizado pela plataforma da DIO(Digital innovation One), com a linguagem Java.

*******
## 1. Padrões de nomenclatura
Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões estão expressos nos itens abaixo: 

**- Arquivo .java:** todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for comporta, a segunda palavra também deve ser maiúscula. Exemplo:
                
    Calculadora.java, CalculadoraCientifica.java      
**- Nome da Classe no arquivo:** a classe deve possuir o mesmo nome do arquivo .java, exemplo:
 
    1 // arquivo CalculadoraCientifica.java
    2
    3 public class CalculadoraCientifica  {
    4
    5 }
    
**- Nome de variável:** toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA.
Exemplo: ano e anoFabricacao. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".

**RECOMENDAÇÕES:** Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém devemos seguir algumas regras da linguagem, como:

- Deve conter apenas letras, underline , $ ou os números de 0 a 9.
- Deve obrigatoriamente se iniciar com uma letra(preferencialmente, underline ou $, jamais com número.
- Deve iniciar com uma letra minúscula.
- Não pode conter espaços.
- Não podemos usar palavras chave da linguagem.
- O nome deve ser único dentro de um escopo. 

## 2. Tipos de dados

No java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas. Estes tipos de dados são conhecidos como primitivos (Primitive Types).

Os oitos tipos primitivos em java são:

     int, byte, short, long, float, double, boolean e char - esses tipos são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória (Memory stack).

### Tabela de Tipos Primitivos e seus Valores

Os tipos primitivos de números inteiros podem ser representados por quatro tipos:

|Tipo|Memória|Valor mínimo|Valor máximo|
|:----:|:----:|:----:|:----:|
|byte|1 byte|-128|127|
|short|2 bytes|-32.768|32.767|
|int|4 bytes|-2.147.483.648|2.147.483.647|
|long|8 bytes|-9.223.372.036.854.775.808|9.223.372.036.854.775.807|

Os tipos primitivos que podem conter partes fracionárias podem ser representados por dois tipos:

|Tipo|Memória|Mínimo|Máximo|
|:---:|:---:|:---:|:---:|
|float|4 bytes|-3,4028E + 38|3,402E + 38|
|double|8 bytes|-1,7976E + 308|1,7976 + 308|

Apesar do tipo **float** ocupar metade da memória consumida do que um tipo **double**, ele é menos utilizado. Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.

Atualmente com os computadores modernos, se tornou desnecessário utilizar os tipos **short** e **byte**, pois não precisamos nos preocupar  tanoto assim com o espaço de memória reduzido. Da mesma forma, dificilmente utilizaremos o tipo long, pois não é tão comum trabalharmos com valores tão grandes.

Portante para representar números, na grande maioria das vezes utilizaremos o tipo **int** para representar números inteiros ou **double** para representar números fracionados.

      Exemplos:
      1 public Class TipoDados {
      2         public static void main(String[] args)  {
      3               byte idade = 123;
      4               short ano = 2022;
      5               int cep = 86618000; // se começar com zero talvez tenha que ser ourto tipo
      6               long cpf = 12345678912; // se começar com zero talvez tenha que ser outro tipo
      7               float pi = 3.14F; // o tipo float precisa ter o "F" no final, se não ele vai dar erro
      8               double salario = 1560.56;
      9         }
      10 }
      
## Variáveis e Constantes

Uma variável é uma área da memória associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado, define um conjunto de valores e um conjunto de opreações . Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

No Java utilizamos identificadores que representam uma referência(ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor , sendo portanto esta a causa do nome **variável**, pois o valor pode variar. 

Já as **constantes** são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada **_final_**, seguida do tipo. Por convenção, Constantes são sempre escritas em CAIXA ALTA. 

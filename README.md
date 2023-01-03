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
- Deve obrigatoriamente se iniciar com uma letra (preferencialmente), underline ou $, jamais com número.
- Deve iniciar com uma letra minúscula.
- Não pode conter espaços.
- Não podemos usar palavras chave da linguagem.
- O nome deve ser único dentro de um escopo. 

## 2. Tipos de dados

No java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas. Estes tipos de dados são conhecidos como primitivos (Primitive Types).

Os oitos tipos primitivos em java são:

- int
- byte
- short
- long
- float
- double
- boolean 
- char 

**Esses tipos são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória (Memory stack).**

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
      
## 3. Variáveis e Constantes

Uma variável é uma área da memória associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado, define um conjunto de valores e um conjunto de opreações . Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

No Java utilizamos identificadores que representam uma referência(ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor , sendo portanto esta a causa do nome **variável**, pois o valor pode variar. 

Já as **constantes** são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada **_final_**, seguida do tipo. Por convenção, Constantes são sempre escritas em CAIXA ALTA. 

## 4. Operador Ternário

O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha. 

O operador ternário é representado pelos símbolos **"?:"** utilizados na seguinte estrutura de sintaxe:

      <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
      
## 5. Operadores Relacionais

Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual , diferente, menor, menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado. 

|Símbolo|Nome do Operador|Significado|
|:---:|:---:|:---:|
|==|Igual à|Quando desejamos verificar se uma variável é igual a outra|
|!=|Diferente|Quando desejamos verificar se uma variável é diferente da outra|
|>|Maior|Quando desejamos verificar se uma variável é maior que a outra|
|>=|Maior ou Igual|Quando desejamos verificar se uma variável é maior ou igual a outra|
|<|Menor|Quando desejamos verificar se uma variável é menor que a outra|
|<=|Menor ou Igual|Quando desejamos verificar se uma variável é menor ou igual a outra|

Lembrando que os operados relacionais são mais utilizados com variáveis numéricas.

## 6. Operadores Lógicos

Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.

     -> && Operador lógico "E";
     -> || Operador lógico "OU";
      
## 7. Métodos

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas dísponiveis dentro de nossas classes. 

#### Critério de nomeação de Métodos

Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir essas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para Métodos, os critérios são:

    -> Deve ser nomeado como verbo, ou seja, no infinitivo (ar, er, ir)
    -> Seguir o padrão camelCase (todas as letras mínusculas com exceção da primeira letra da segunda palavra)
    
**Obs: não existe em Java o conceito de métodos globais. Todos os métodos devem SEMPRE ser definidos dentro de uma classe.**

#### Critério de definição dos Métodos

Mas, como sabemos a melhor forma de definir os métodos das nossas classes? Para chegar a essa conclusão, somos auxiliados por uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:

   1 - **Qual a proposta principal do método?** Você deve se perguntar constantemente até compreender a real finalidade do mesmo.
   
   2 - **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se o método será responsável por retornar algum valor ou não.
   
   **Caso o método não retorne nenhum valor, ele será representado pela palavra-chave void.**

## 8. Escopo

O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. Em java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.

A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence. Portanto, essa variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto acessíveis por todos os métodos.

Caso você declare uma variável dentro de um método, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.


## 9. Palavras reservadas

Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica, portanto não podem ser utilizadas para nomear variáveis, classes, métodos, ou atributos. 

A linguagem java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritas com letra minúscula, sendo identificadas com uma cor especial pela maioria das IDE's. Abaixo, temos as listas das palavras agrupadas por suas finalidades:

**Controle de pacotes**

- import: importa pacotes ou classes para dentro do código
- package: especifica a que pacote todas as classes de um arquivo pertencem

**Modificadores de acesso**

- public: acesso a qualquer classe
- private: acesso apenas dentro da classe
- protected: acesso por classes no mesmo pacote e subclasses

**Tipos primitivos**

- boolean, byte, char, double, float, int, long, short, void

**Modificadores de classes, variáveis ou métodos**

- abstract: classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata
- class: especifica uma classe
- extends: indica a superclasse que a subclasse está estendendo
- final: impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada
- implements: indica as interfaces que uma classe irá implementar
- interface: especifica uma interface
- native: indica que um método está escrito em uma linguagem dependente da plataforma, como o C
- new: instancia um novo objeto, chamando seu construtor 
- static: faz um método ou variável pertence à classe ao invés de às instâncias 
- strictfp: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões
- synchronized: indica que um método só pode ser acessado por uma thread de cada vez
- transient: impede a serialização de campos
- volatile: indica que uma variável pode ser alterada durante o uso de threads

**Controle de fluxo dentro de um bloco de código**

- break: sai do bloco de código em que ele está
- case: executa um bloco de código dependendo do teste do switch 
- continue: pula a execução do código que viria após essa linha e vai para a próxima passagem do loop

**Tratamentos de erro**

- assert: testa uma expressão condicional para verificar uma suposição do programador
- catch: declara o bloco de código usando para tratar uma exceção
- finally: bloco de código, após um try-catch, que é executado independentemente do fluxo do programa seguido ao lidar com uma exceção


## 10. Terminal e argumentos

Nem sempre executamos nosso programa java pela IDE. Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional. Também é possível executar um programa java via terminal como MS - DOS ou terminal do VsCode. 

### Executando um programa pelo terminal

Todo projeto java criado por uma IDE, possui por padrão, uma pasta chamada **bin**. É nessa pasta que ficarão os arquivos .class, o nosso bytecode. Mesmo usando uma IDE nós sempre precisaremos identificar onde se encontram as classes do nosso projeto.

Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

1 - Localize o diretório do seu projeto;

2 - Entre na pasta bin;

3 - Abra o MS - DOS dentro da pasta;

4 - Digite "dir" sem as aspas para poder visualizar os arquivos;

5 - Agora digite o comando: **java MinhaClasse** (nome da sua classe sem a extensão .class). Ficará assim:

### Argumentos

Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array [ ] de argumentos do tipo String. Logo podemos após a definição da classe a ser executada informar estes parâmetros. Exemplo:

     1 java MinhaClasse argumentoUm argumentoDois
     
## 11. Controle de fluxo 

Os controles de fluxo são estruturas que tem capacidade de direcionar o fluxo de execução do código. 

Os tipos de controle de fluxo são:

- Decisão: if, if-else, if-else-if, switch e operador ternário
- Repetição: for, while, do while
- Interrupção: break, continue e return







     

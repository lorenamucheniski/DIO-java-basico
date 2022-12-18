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

|Tipo|Memória|Valor mínimo|Valor máximo|
|:----:|:----:|:----:|:----:|
|byte|1 byte|-128|127|
|short|2 bytes|-32.768|32.767|
|int|4 bytes|-2.147.483.648|2.147.483.647|
|long|8 bytes|-9.223.372.036.854.775.808|9.223.372.036.854.775.807|

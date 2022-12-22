public class Operadores1 {
	
	public static void main (String[] args) {
		String concatenacao = "?";
		
		concatenacao = 1+1+1+"1"; // //enquanto o próximo valor for numérico, ele ainda servirá como um operador de atribuição soma, por isso o resultado da 1º expressão é igual a 31 
		
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+1; //aqui temos o 1 operador, mas logo após já temos um texto, acontecendo assim a concatenação, por isso o resultado da 2º expressão é de "1111", e assim por diante.
		
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+"1"; //resultado = "1111"
		
		System.out.println(concatenacao);
		
		concatenacao = "1"+1+1+1; //resultado = "1111"
		
		System.out.println(concatenacao);
		
		concatenacao = "1" + (1+1+1); //resultado = "13"
		
		System.out.println(concatenacao);
		
	}
	
}

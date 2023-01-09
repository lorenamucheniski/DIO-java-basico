package metodos;

public class Calculadora {

	public static void somar(double n1 , double n2) {
		double r = n1 + n2;
		
		System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a : " + r);
	}
	
	public static void subtrair(double n1, double n2) {
		double r = n1 - n2;
		
		System.out.println("A subtração entre " + n1 + " e " + n2 + " é igual a : " + r);
	}
	
	public static void multiplicar(double n1, double n2) {
		double r = n1 * n2;
		
		System.out.println("A multiplicação entre " + n1 + " e " + n2 + " é igual a : " + r);
	}
	
	public static void dividir(double n1, double n2) {
		double r = n1 / n2;
		
		System.out.println("A divisão entre " + n1 + " e " + n2 + " é igual a : " + r);
	}
}

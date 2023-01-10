package metodos;

public class Main {

	public static void main(String[] args) {
		
		//Calculadora
		System.out.println("Exercício calculadora: ");
		Calculadora.somar(15, 20);
		Calculadora.subtrair(20, 9.8);
		Calculadora.multiplicar(10, 2);
		Calculadora.dividir(30, 5);
		
		//Mensagem
		System.out.println("Bem vindo! Que horas são?");
		Mensagem.obterMensagem(10);
		Mensagem.obterMensagem(15);
		Mensagem.obterMensagem(21);	
		
		//Emprestimo
		System.out.println("Empréstimo Bancário");
		System.out.println("Digite o valor que deseja e a quantidade de parcelas (2 ou 3):");
		Emprestimo.calcular(1000, 2);
		Emprestimo.calcular(850, 3);

	}
	
}

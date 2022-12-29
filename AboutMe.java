public class AboutMe {
	
	public static void main(String[] args) {
		
		String nome = args [0];
		String sobrenome = args [1];
		int idade = Integer.valueOf(args[2]);
		double altura = Double.valueOf(args [3]);
		
		System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
		System.out.println("Tenho " + idade + " anos de idade.");
		System.out.println("Minha altura é de " + altura + "m.");
		
	}
}
			
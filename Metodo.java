public class Metodo {
	
	public static void main (String[] args) {
		
		String primeiroNome = "Lorena";
		String segundoNome = "Mucheniski";
		
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
		
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
		
	}
	
}
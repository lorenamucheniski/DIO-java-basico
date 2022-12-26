public class Usuario {
	
	public static void main(String[] args) throws Exception {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Tv ligada? " + smartTv.ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
		
		smartTv.aumentarVolume();
		System.out.println("Novo volume: " + smartTv.volume);
		
		smartTv.diminuirVolume();
		System.out.println("Novo volume: " + smartTv.volume);
		
		smartTv.escolherCanal(8);
		System.out.println("Canal atual: " + smartTv.canal);
		
		smartTv.aumentarCanal();
		System.out.println("Canal atual: " + smartTv.canal);
		
		smartTv.diminuirCanal();
		System.out.println("Canal atual: " + smartTv.canal);
		
	}
	
}
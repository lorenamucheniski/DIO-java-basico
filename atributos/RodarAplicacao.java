 package atributos;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setCor("Vermelho");
		carro1.setModelo("BMW");
		carro1.setCapacidadeTanque(50);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalValorTanque(4.39));
		
		
		Carro carro2 = new Carro("Cinza", "Gol G6", 56);
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(3.26));

	}

}

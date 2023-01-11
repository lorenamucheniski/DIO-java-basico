package calculo_area;

public class Area {
	
	public static void calcular(double lado) {
		
		double totalArea = lado * lado;
		System.out.println(totalArea);
	}
	
	public static void calcular(double base, double altura) {
		
		double totalArea = base * altura;	
		System.out.println(totalArea);
	}
	
	public static void calcular(double base1, double base2, double altura) {
		
		double totalArea = ((base1 + base2) * altura) / 2;
		System.out.println(totalArea);
		
	}

}

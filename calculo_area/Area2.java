package calculo_area;

public class Area2 {
	
	public static double Calcular(double lado) {
		
		return lado * lado;
	}
	
	public static double calcular(double base, double altura) {
		
		return base * altura;
	}
	
	public static double calcular(double base1, double base2, double altura) {
		
		return((base1 + base2) * altura) / 2;
	}
}

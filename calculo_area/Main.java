package calculo_area;

public class Main {

	public static void main(String[] args) {
		
		// Area
		System.out.println("Area do quadrado: ");
		Area.calcular(5.5);
		
		System.out.println("Area do retangulo: ");
		Area.calcular(5.6, 3);
		
		System.out.println("Area do trapezio: ");
		Area.calcular(16, 10.5, 6.2);
		
		//Area2
		double areaQuadrado = Area2.Calcular(7);
		System.out.println("Area do quadrado: " + areaQuadrado);
		
		double areaRetangulo = Area2.calcular(10, 6.8);
		System.out.println("Area do retangulo: " + areaRetangulo);
		
		double areaTrapezio = Area2.calcular(15, 9.9, 10);
		System.out.println("Area do trapezio: " + areaTrapezio);
		
	

	}

}

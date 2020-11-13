package GeometricalFigures;
/*
 * Final keyword has numeros way to use:
 * 
 * A final class cannot be subclassed.
 * A final method canonot be overriden by subclasess
 * A final varibale can only be initialized once
 */

/*
 * super means reference to superior class
 */

public class TestingFigures {

	public static void main(String[] args) {
		// System.out.print(Math.sin(Math.PI));
		double lado = 6;
		Cuadrado c1 = new Cuadrado(lado);
		
		double base =10;
		double altura=5;
		Retangulo r1=new Retangulo(base,altura);
		
		double base_p= 3;
		double altura_p = 5;
		double theta= Math.PI/6.;
		Paralelogramo p1 = new Paralelogramo(base_p, altura_p, theta);
		
		Paralelogramo[] figarray= {c1,r1,p1};
		
		for(int fig=0; fig<figarray.length; fig++ ) {
			double pe = figarray[fig].getPerimeter();
			double ar = figarray[fig].getArea();
			System.out.println(figarray[fig]);
			System.out.println(" Area: "+ar+" Perimetro: "+pe);
		}
		
		
		
	}

}

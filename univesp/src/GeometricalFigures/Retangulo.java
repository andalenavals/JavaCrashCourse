package GeometricalFigures;

public class Retangulo extends Paralelogramo{
	
	public Retangulo(double base, double h) {
		super(base,h, 0.5*Math.PI);
	}
	
	public void set(double lado1, double lado2) {
		super.set(lado1, lado2, 0.5*Math.PI);
	}
}

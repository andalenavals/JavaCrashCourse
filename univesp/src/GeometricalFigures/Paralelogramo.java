package GeometricalFigures;

public class Paralelogramo {
	private double base;
	private double h;
	private double theta;
	
	public Paralelogramo(double base, double h, double theta) {
		this.base=base;
		this.h=h;
		this.theta=theta;				
	}

	public double getBase() {
		return base;
	}

	public double getH() {
		return h;
	}

	public double getTheta() {
		return theta;
	}

	public void set(double base, double h, double theta) {
		this.base=base;
		this.h=h;
		this.theta=theta;
	}
	
	public String toString() {
		return " base: "+base+" altura: "+h+" theta: "+theta;
	}
	
	public double getArea() {
		return base*h;
	}
	
	public double getPerimeter() {
		return 2*(base+h/Math.sin(theta));
	}

}

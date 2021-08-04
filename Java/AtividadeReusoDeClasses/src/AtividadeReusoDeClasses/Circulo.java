package AtividadeReusoDeClasses;

public class Circulo extends ObjetoGeometrico {
	
	public Circulo(double d1, double d2) {
		super(d1, d2);
	}
	public double getAreaCirculo() {
		return 3.14  * getArea();
	}
	
	public double getPerimetroCirculo() {
		return 2 * 3.14 * getD1();
	}
}

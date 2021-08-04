package AtividadeReusoDeClasses;

public class Retangulo extends ObjetoGeometrico{
	public Retangulo (double d1, double d2) {
		super(d1, d2);
	}
	
	public double getAreaRetangulo() {
		return getArea();
	}
	
	public double getPerimetroRetangulo() {
		return 2 * getPerimetro();
	}
}

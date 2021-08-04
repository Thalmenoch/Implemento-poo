package AtividadeReusoDeClasses;

public class ObjetoGeometrico {
	private double d1, d2;
	
	public ObjetoGeometrico(double d1, double d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
	
	public double getD1() {
		return d1;
	}
	
	public double getD2() {
		return d2;
	}
	
	public double getArea() {
		return d1*d2;
	}
	
	public double getPerimetro() {
		return d1+d2;
	}
}

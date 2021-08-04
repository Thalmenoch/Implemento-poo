package AtividadeReusoDeClasses;
import java.lang.Math;
public class Triangulo extends ObjetoGeometrico {
	
	private double d3;
	
	public Triangulo(double d1, double d2, double d3) {
		super(d1, d2);
		this.d3 = d3;
	}
	
	public double getAreaTriangulo() {
		return Math.sqrt(( getPerimetroTriangulo()/2) * ((getPerimetroTriangulo()/2)- getD1()) * ((getPerimetroTriangulo()/2) - getD2()) * ((getPerimetroTriangulo()/2) - d3));
	}
	
	public double getPerimetroTriangulo() {
		return getPerimetro() + d3;
	}
}

package AtividadeReusoDeClasses;

public class Main {
	public static void main(String[] args) {
		Circulo c = new Circulo(4, 4);
		System.out.println("�rea do c�rculo : "+ c.getAreaCirculo());
		System.out.println("Per�metro do c�rculo: "+ c.getPerimetroCirculo());
	
		Retangulo r = new Retangulo(8, 5);
		System.out.println("�rea do tri�ngulo: "+ r.getAreaRetangulo());
		System.out.println("Per�metro do tri�ngulo: "+ r.getPerimetroRetangulo());
		
		Triangulo t = new Triangulo(3, 3, 2);
		System.out.println("�rea do ret�ngulo: "+ t.getAreaTriangulo());
		System.out.println("Perimetro do retangulo: "+t.getPerimetroTriangulo());
	}
}

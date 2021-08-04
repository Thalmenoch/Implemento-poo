package AtividadeReusoDeClasses;

public class Main {
	public static void main(String[] args) {
		Circulo c = new Circulo(4, 4);
		System.out.println("Área do círculo : "+ c.getAreaCirculo());
		System.out.println("Perímetro do círculo: "+ c.getPerimetroCirculo());
	
		Retangulo r = new Retangulo(8, 5);
		System.out.println("Área do triângulo: "+ r.getAreaRetangulo());
		System.out.println("Perímetro do triângulo: "+ r.getPerimetroRetangulo());
		
		Triangulo t = new Triangulo(3, 3, 2);
		System.out.println("Área do retângulo: "+ t.getAreaTriangulo());
		System.out.println("Perimetro do retangulo: "+t.getPerimetroTriangulo());
	}
}

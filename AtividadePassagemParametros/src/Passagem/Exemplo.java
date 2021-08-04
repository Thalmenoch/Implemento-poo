package Passagem;

public class Exemplo {
	
	String nome;
	
	public Exemplo(String nome) {
		this.nome = nome;
	}
	public static void main(String[] args) {
		Exemplo ex = new Exemplo("Cavalo");
		System.out.println("Teste: " + ex.nome);
		mod(ex);
		
		System.out.println("Teste: " + ex.nome);
	}
	
	public static void mod(Exemplo ex) {
		ex.nome = "Repeteco";
	}
}

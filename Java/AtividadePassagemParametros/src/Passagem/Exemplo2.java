package Passagem;

public class Exemplo2 {
	public static void main(String[] args) {
		teste("coisa1");
		teste("coisa1", "coisa2");
		teste("coisa1", "coisa2", "coisa3");	
	}
	public static void teste(String...coisas) {
		for(String coisa: coisas)
				System.out.println(coisa);
	}
}

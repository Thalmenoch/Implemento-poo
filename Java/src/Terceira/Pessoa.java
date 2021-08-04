package Terceira;

public class Pessoa {
	String nome, endereco, sexo, andar, cpf;
	int idade;
	
	public Pessoa(String nome, String sexo, int idade, String cpf, String endereco, String andar) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.andar = andar;
	}
	public void imprimirValores() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Sexo: "+ this.sexo);
		System.out.println("Idade: "+ this.idade);
		System.out.println("Cpf: "+ this.cpf);
		System.out.println("Endereço: "+ this.endereco);
		System.out.println("Uma pessoa pode andar: "+ this.andar);
	}
}

package Terceira;

public class Medico extends Pessoa{
	
	String crm, esp, plant;
	double sal;
	
	public Medico(String nome,String sexo, int idade, String cpf, String endereco, String andar, String crm, double sal, String esp, String plant) {
		super(nome, sexo, idade, cpf, endereco, andar);
		this.crm = crm;
		this.sal = sal;
		this.esp = esp;
		this.plant = plant;
	}
	@Override
	public void imprimirValores() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Sexo: "+ this.sexo);
		System.out.println("Idade: "+ this.idade);
		System.out.println("Cpf: "+ this.cpf);
		System.out.println("Endereço: "+ this.endereco);
		System.out.println("Uma pessoa pode andar: "+ this.andar);
		System.out.println("Crm: "+ this.crm);
		System.out.println("Salário: " + this.sal);
		System.out.println("Especialização: " + this.esp);
		System.out.println("Um médico pode dar plantão: " + this.plant);
	}
}	

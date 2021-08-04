package Terceira;

public class Paciente extends Pessoa{
	
	String doenca, medicacao, dor, alta;
	
	public Paciente(String nome,String sexo, int idade, String cpf, String endereco, String andar, String doenca, String medicacao, String dor, String alta) {
		super(nome, sexo, idade, cpf, endereco, andar);
		this.doenca = doenca;
		this.medicacao = medicacao;
		this.dor = dor;
		this.alta = alta;
	}
	@Override
	public void imprimirValores() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Sexo: "+ this.sexo);
		System.out.println("Idade: "+ this.idade);
		System.out.println("Cpf: "+ this.cpf);
		System.out.println("Endereço: "+ this.endereco);
		System.out.println("Uma pessoa pode andar: "+ this.andar);
		System.out.println("Qual a doença do paciente: " + this.doenca);
		System.out.println("Qual medicação o paciente deve tomar: "+ this.medicacao);
		System.out.println("Um paciente sente dor: " + this.dor);
		System.out.println("Um paciente pode ter alta : " + this.alta);
	}
	
}

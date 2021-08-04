import java.util.Date;
import java.util.Scanner;

public class Funcionario {
	private String nome; 
	private Date dataAdmissao;
	private double salario;
	private static int identificador = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public Date getDataAdmissao() {
		return this.dataAdmissao;
	}
	
	public void setDataAdmissao(Date newDataAdmissao, Date newDataAux) {
		if(dateCheck(newDataAdmissao,newDataAux)) 
			this.dataAdmissao = newDataAdmissao;
		else
			throw new IllegalArgumentException("Data inv�lida!");
	}
	
	public void setSalario(double newSalario) {
		if(ifCheck(newSalario)) {	
			this.salario = newSalario;
		}else {
			throw new IllegalArgumentException("Sal�rio Inv�lido!");//No caso do if sendo skippado
		}	
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public int getIdentificador() {
		Funcionario.identificador = Funcionario.identificador + 1;
		return Funcionario.identificador;
	}
	
	public boolean dateCheck(Date newDataAdmissao, Date newDataAux) {
		return newDataAdmissao.before(newDataAux);
	}
	
	public boolean ifCheck(double newSalario) {
		return (newSalario >= 700);
	}
	
	public void tirarFerias() {
		//System.out.println("Funcion�rio vai tirar f�rias de 30 dias !");
		tirarFerias(0);
	}

	public void tirarFerias(int dias) {
		System.out.print("Insira a quantidade de dias de f�rias:");
		dias = sc.nextInt();
		System.out.println("Dias de f�rias que o funcion�rio ir� receber:" + dias);
	}
}


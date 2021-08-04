import java.util.Date;

public class Funcionario {
	private String nome; 
	private Date dataAdmissao;
	private double salario;
	private static int identificador = 0;
	
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
			throw new IllegalArgumentException("Data inválida!");
	}
	
	public void setSalario(double newSalario) {
		if(ifCheck(newSalario)) {	
			this.salario = newSalario;
		}else {
			throw new IllegalArgumentException("Salário Inválido!");//No caso do if sendo skippado
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

}


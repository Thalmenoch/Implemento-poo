package SistemaAv;
import java.util.ArrayList;
import java.util.Date;
public class ClientePessoaFisica {
	
	String nome, endereco;
	int cpf, num_tel;
	Date d_nasc;
	
	public ClientePessoaFisica(String nome, int cpf, Date d_nasc, String endereco, int num_tel) {
		this.nome = nome;
		this.cpf = cpf;
		this.d_nasc = d_nasc;
		this.endereco = endereco;
		this.num_tel = num_tel;
	}
	
	public void registrarPedidoLocacao(ArrayList<Double> lista, LocadorPessoaFisica locador, 
			Date dataInicio, Date dataFim) {
		
	}
}


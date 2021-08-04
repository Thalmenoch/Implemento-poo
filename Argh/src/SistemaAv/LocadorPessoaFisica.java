package SistemaAv;

import java.util.Date;

public class LocadorPessoaFisica extends ClientePessoaFisica {
	
	public LocadorPessoaFisica(String nome, int cpf, Date d_nasc, String endereco, int num_tel) {
		super(nome, cpf, d_nasc, endereco, num_tel);
	}
	
	void autorizarLocacao(int idPedidoLocacao) {
		
	}
}

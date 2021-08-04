package controller;

import model.Pessoa;
import model.PessoaDAO;

public class CtrlPessoa {
	
	public boolean salvar(Pessoa p) throws Exception{
		if(p.getNome().isEmpty()) 
			return false;	
		
		PessoaDAO psd = new PessoaDAO();	
		return psd.autentificarNome(p);
	}
}

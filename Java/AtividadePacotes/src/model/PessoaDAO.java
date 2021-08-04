package model;

import java.io.FileWriter;
import java.io.BufferedWriter;
public class PessoaDAO {

	public boolean autentificarNome(Pessoa p) throws Exception{
		BufferedWriter buff = new BufferedWriter(new FileWriter("Nome.txt"));
		buff.append(p.getNome());	
		buff.close();
		return false;
	}
}

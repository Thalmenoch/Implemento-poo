package view;

import java.util.Scanner;
import model.Pessoa;
import controller.CtrlPessoa;

public class CadPessoa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		Pessoa p = new Pessoa();
		CtrlPessoa cps = new CtrlPessoa();
		
		p.setNome(nome);
		
		try {
			cps.salvar(p);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}


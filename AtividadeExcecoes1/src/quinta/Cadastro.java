package quinta;
import java.util.Scanner;
public class Cadastro {
	
	private String nome, ddd, numero;
	
	public boolean ifCheckNome(String check) {
		return !check.equals("");
	}
	
	public void setNome(String nome) {
		if(ifCheckNome(nome)) {
			this.nome = nome;
		}else {
			throw new IllegalArgumentException("Nome Inválido!");
		}
	}
	
	public String getNome(String nome) {
		return this.nome;
	}
	
	public boolean ifCheckDDD(String check) {
		return check.length() == 2;
	}
	
	public void setDDD(String DDD) {
		if(ifCheckDDD(DDD)) {
			this.ddd = DDD;
		}else {
			throw new IllegalArgumentException("DDD Inválido!");
		}
	}
	
	public String getDDD(String ddd) {
		return this.ddd;
	}
	
	public boolean ifCheckNumero(String check) {
		return check.length() == 9;
	}
	
	public void setNumero(String numero) {
		if(ifCheckNumero(numero)) {
			this.numero = numero;
		}else {
			throw new IllegalArgumentException("Número Inválido!");
		}
	}
	
	public String getNumero(String numero) {
		return this.numero;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cadastro cd = new Cadastro();
		String[] str = new String[3];
		
		do {
			System.out.print("Insira o seu nome: ");
			str[0] = sc.nextLine();
		}while(!cd.ifCheckNome(str[0]));
		
		do {
			System.out.print("Insira o seu ddd: ");
			str[1] = sc.nextLine();
		}while(!cd.ifCheckDDD(str[1]));
		
		do {
			System.out.print("Insira o seu número: ");
			str[2] = sc.nextLine();
		}while(!cd.ifCheckNumero(str[2]));
		
		cd.setNome(str[0]);
		cd.setDDD(str[1]);
		cd.setNumero(str[2]);
		
		System.out.println("Cadastro Realizado!");
		System.out.println("Nome: "+cd.getNome(str[0]));
		System.out.println("Número de Telefone: " + cd.getDDD(str[1])+cd.getNumero(str[2]));
		sc.close();
	}
}

package Polimorfismo;

public class Produto {
	private String nome, desc;
	private double preco;
	
	public Produto(String nome, String desc, double preco) {
		this.nome = nome;
		this.desc = desc;
		this.preco = preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return desc;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	
	public boolean check(Object obj) { // equals
		if(obj instanceof Produto) {
			Produto q = (Produto)obj;
			return q.nome.equals(nome);
		}else return false;
	}
	
	public String toString() {
		return "Produto: <" + this.nome + ">, <"+ this.desc + ">, <"+ this.preco + "R$>.";
	}
}

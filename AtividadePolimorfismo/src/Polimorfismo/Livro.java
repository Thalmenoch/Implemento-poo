package Polimorfismo;

public class Livro extends Produto {
	
	private String autores, isbn, editora;
	
	public Livro(String nome, String desc, double preco, String autores, String isbn, String editora) {
		super(nome, desc, preco);
		this.autores = autores;
		this.isbn = isbn;
		this.editora = editora;
	}
	
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public String getAutores() {
		return autores;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIsbn() {
		return isbn;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getEditora() {
		return editora;
	}
	
	@Override
	public boolean check(Object obj) { // equals
		if(obj instanceof Livro) {
			Livro q = (Livro)obj;
			return q.getNome().equals(getNome());
		}else return false;
	}
	
	public boolean check1(Object obj) { //equals
		if(obj instanceof Livro) {
			Livro q = (Livro)obj;
			return isbn.equals(q.getIsbn());
		}else return false;
	}

	
	@Override
	public String toString() {
		return "Livro: <" + getNome() + ">, <"+ getDesc() + ">, <"+ getPreco() + ">, <" + getAutores()+">, <"+getIsbn()+">, <"+getEditora()+">.";
	}
}

package teste2;

public class ClientePF extends PessoaFisica {
	private int codCliente;
	
	public ClientePF() {
		this(999);
		System.out.println("ClientePF()");
	}
	
	public ClientePF(int codCliente) {
		super();
		System.out.println("ClientePF("+codCliente+")");
		this.codCliente = codCliente;
		super.show();
	}
	
	public void show() {
		System.out.println("Show ClentePF");
	}
	public static void main(String[] args) {
		//new ClientePf();
	}
}

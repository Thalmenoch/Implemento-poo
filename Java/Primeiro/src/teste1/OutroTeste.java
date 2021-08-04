package teste1;

public class OutroTeste {
	
	public int x;

	public OutroTeste () {
		System.out.println("Sem parâmetros !");
	}
	
	public OutroTeste(int x) {
		System.out.println("Com parâmetros !");
		this.x = x;
	}
	public void fdp() {
		System.out.println("FDP");
	}
}

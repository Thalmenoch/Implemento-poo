package ferrovia;

public class Station {
	private String sigla, desc;
	private int qtd_linhas;
	
	public Station (String sigla, String desc, int qtd_linhas) {
		this.sigla = sigla;
		this.desc = desc;
		this.qtd_linhas = qtd_linhas;
	}
	
	public String infoStation() {
		return "Esta??o: <" + this.sigla + ">, <"+ this.desc + ">, <"+ this.qtd_linhas + ">";
	}
}

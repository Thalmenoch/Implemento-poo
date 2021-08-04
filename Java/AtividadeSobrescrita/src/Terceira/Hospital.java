package Terceira;

public class Hospital {
	
	String nomeHospital;
	
	public Hospital(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}
	
	public void imprimirValor() {
		System.out.println("Nome do hospital: " + this.nomeHospital);
	}
}

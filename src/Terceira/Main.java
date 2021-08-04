package Terceira;

public class Main {
	public static void main(String[] args) {
		Pessoa ps = new Pessoa("Almeida","Masculino",29,"065.150.973-64","Beira Mar","Sim");
		ps.imprimirValores();
		
		Paciente pc = new Paciente("Almeida","Masculino",29,"065.150.973-64","Beira Mar","Sim","Hemorróida","Hp-123","Sim","Sim");
		pc.imprimirValores();
		
		Medico md = new Medico("Mirla","Feminino",37,"133.149.353-85","Castelão","Sim","042066",8500,"Otorrinolaringologista","Sim");
		md.imprimirValores();
		
		Hospital hp = new Hospital("Prudente");
		hp.imprimirValor();
		
	}

}

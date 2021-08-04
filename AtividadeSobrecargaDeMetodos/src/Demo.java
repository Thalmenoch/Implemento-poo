
public class Demo {
	public static void main(String[] args) {
		Funcionario fd = new Funcionario();
		Relogio re = new Relogio();
		
		fd.tirarFerias();
	
		re.inicializar(0, 0, 0);
        //re.inicializar(0, 0);
        //re.inicializar(0);
	}
}

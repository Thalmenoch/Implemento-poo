package SistemaAv;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Main {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		ClientePessoaFisica cl = new ClientePessoaFisica("Carlos",82584521 , 
				sdf.parse("23/03/2001"), "Rua 25 casa 891", 217864948);
		
		LocadorPessoaFisica lp = new LocadorPessoaFisica("Carlos",82584521 , 
				sdf.parse("23/03/2001"), "Rua 25 casa 891", 217864948);
		
		cl.registrarPedidoLocacao(2555, lp, sdf.parse("31/03/1999"), sdf.parse("08/05/2015"));
		lp.autorizarLocacao(0);
	}
}

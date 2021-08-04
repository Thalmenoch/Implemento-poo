import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws ParseException {
		Funcionario func = new Funcionario();
		Scanner sc = new Scanner(System.in);
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		Date data_aux = new Date();
		
		System.out.print("Por favor, insira a data atual(dd/mm/yyyy): ");
		String data_aux2 = sc.nextLine();
		data_aux = sdf.parse(data_aux2);
		
		double sal;
		
		System.out.print("Insira seu nome: ");
		String ent = sc.nextLine();
		
		
		do {
			
			System.out.println();
			System.out.print("Insira sua data de admissão no formato dd/mm/aaaa: ");
					
			String dataAdmissao = sc.nextLine();
			data = sdf.parse(dataAdmissao);
				
			//if(data.before(data_aux))
				//date_check = true;
				
			
		}while(!func.dateCheck(data, data_aux));
		
		do {
			System.out.println();
			System.out.println("O mínimo salarial é 700!");
			System.out.print("Insira seu salário: ");
			sal = sc.nextDouble();
		}while(!func.ifCheck(sal));//Vai continuar enquanto sal < 700
		
		func.setNome(ent); 
		func.setDataAdmissao(data, data_aux);
		func.setSalario(sal);
			
		System.out.println();
		System.out.println(func.getNome());
		System.out.println(sdf.format(data));
		System.out.println(func.getSalario());	
		System.out.print("Identificador: ");
		System.out.println(func.getIdentificador());
		
		sc.close();
	}
}

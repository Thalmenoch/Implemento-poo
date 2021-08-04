package Quarta;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class B {
	public static void main(String[] args) throws ParseException {
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		dt = sdf.parse("07/06/2021");
		System.out.println(sdf.format(dt));
	}
}

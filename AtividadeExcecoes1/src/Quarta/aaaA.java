package Quarta;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class aaaA {
	public static void main(String[] args) {
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			dt = sdf.parse("07/06/2021");
		} catch (ParseException e) {
			
		}
		System.out.println(sdf.format(dt));
	}
}

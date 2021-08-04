package Exceptions;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		String str = sc.nextLine();
		
		try {
			data = sdf.parse(str);
			System.out.println(sdf.format(data));
		}catch(ParseException e){
			
			e.printStackTrace();
		}
		sc.close();
	}
	
}

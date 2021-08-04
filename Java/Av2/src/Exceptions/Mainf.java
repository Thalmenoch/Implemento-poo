package Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Mainf {
	public static void dataF() throws ParseException{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		String str = sc.nextLine();
		
		data = sdf.parse(str);
		System.out.println(sdf.format(data));
		
		sc.close();
	}
	
	public static void main(String[] args) { 
		try {
			dataF();
		}catch(ParseException e){
			
			e.printStackTrace();
		}
	}
	
}

package Exceptions;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Data {
	private String str;
	private Date data;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Date getData() {
		return data;
	}
	public void setData(String aux)  throws ParseException{
		this.str = aux;
		this.data = sdf.parse(str);
	}
	
}

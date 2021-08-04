import java.util.Scanner;

public class Relogio {
	Scanner sc = new Scanner(System.in);
	
	void inicializar(int hr, int min, int seg) {
		do {
			System.out.print("Insira as horas: ");
			hr = sc.nextInt();
		}while(hr > 24 || hr < 0);
		
		do {
			System.out.print("Insira os minutos: ");
			min = sc.nextInt();
		}while(min > 60 || min < 0);
		
		do {
		System.out.print("Insira os segundos: ");	
		seg = sc.nextInt();
		}while(seg > 60 || seg < 0);
		
		System.out.println(hr+":"+min+":"+seg);
	}
	
	void inicializar(int hr, int min) {
		inicializar(hr, min,01);
	}
	
	void inicializar(int hr) {
		inicializar(hr, 01, 01);
	}
}

package Quarta;
import java.util.Scanner;
public class C {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x < 0) {
			sc.close();
			throw new Exception("N�meros abaixo de zero s�o inv�lidos!");
		}
		sc.close();
	}
		
}

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y = 0;
		System.out.print("x = ");//1ª questão
		x = sc.nextInt();
		
		do{ 
			if(x % 2 == 0) {
				y = x/2;
			}else if(x % 2 == 1) {
				y = (3*x)+1;
			}
			
			System.out.println("y = " + y);
			x = y;
		}while(y != 1);
		
		System.out.println();//2ª questão
		System.out.print("n = ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++){
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		
		System.out.println();//3ª questão
		System.out.print("fat = ");
		int fat = sc.nextInt();
		int aux = fat;
		
		System.out.print(fat+"! = ");
		
		while(aux > 1) {
			aux--;
			fat *= (aux);
		}
		
		System.out.println(fat);
		
		System.out.println();//4ª questão
		System.out.print("Insira a numeração do termo: ");
		int num1 = 0, num2 = 1, fib;
		fib = sc.nextInt();
		aux = fib;
		
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		
		for(int i = 0; i < (aux - 2); i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			System.out.print(num2 + " ");
		}
		System.out.println();
		System.out.println("O termo " + fib + " é : " + num2);
		
		sc.close();
	}
}

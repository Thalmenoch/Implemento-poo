package Polimorfismo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, desc, autor, isbn, editora;
		double preco;
		
		List<Produto> pr = new ArrayList<>();
		
		boolean a = true;
		
		while(a) {
			
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Cadastrar Livro");
			System.out.println("4 - Listar Livros");
			System.out.println("5 - Listar tudo");
			System.out.println("6 - Sair");
			int ops = sc.nextInt();
			
			switch (ops) {
				case 1:
					
					System.out.print("Insira o nome do Produto: ");
					sc.nextLine();
					nome = sc.nextLine();
					
					System.out.print("Insira a descrição do Produto: ");
					desc = sc.nextLine();
					
					System.out.println("Insira o preço do Produto: ");
					preco = sc.nextDouble();
					
					Produto prod = new Produto(nome, desc, preco);
					
					boolean rep = false;
					for(Produto p : pr) {
						if(prod.check(p)) {
							rep = true;
							break;
						}	
					}
					
					if(rep) {
						System.out.println("Nome repetido !");
					}else {
						pr.add(prod);
					}
					System.out.println("");
					break;
					
				case 2:
					
					for(Produto p : pr) {
						if(!(p instanceof Livro))
							System.out.println(p);
					}
					System.out.println();
					break;
					
				case 3:
					
					System.out.print("Insira o nome do Livro: ");
					sc.nextLine();
					nome = sc.nextLine();
					
					System.out.print("Insira a descrição do Livro: ");
					desc = sc.nextLine();
					
					System.out.println("Insira o preço do Livro: ");
					preco = sc.nextDouble();
					
					System.out.print("Insira o(s) autor(es): ");
					sc.nextLine();
					autor = sc.nextLine();
					
					System.out.print("Insira o ISBN do livro: ");
					isbn = sc.nextLine();
					
					System.out.print("Insira a editora: ");
					editora = sc.nextLine();
					
					Livro liv = new Livro(nome, desc, preco, autor, isbn, editora);
					
					rep = false;
					for(Produto p : pr) {
						if(liv.check(p)) {
							rep = true;
							break;
						}	
					}
					
					boolean rep2 = false;
					for(Produto p : pr) {
						if(liv.check1(p)) {
							rep2 = true;
							break;
						}	
					}
					
					if(rep || rep2) {
						System.out.println("Nome ou ISBN repetido !");
					}else {
						pr.add(liv);
					}
					
					System.out.println("");
					break;
					
				case 4:
					
					for(Produto p: pr) {
						if(p instanceof Livro)
							System.out.println(p);
					}
					System.out.println();
					break;
				
				case 5:
					
					for(int i = 0; i < pr.size();i++) {
						System.out.println(pr.get(i).toString());
					}
					System.out.println();
					break;
					
				case 6:
					a = false;
					break;
			}
		}
		
		sc.close();
	}
}

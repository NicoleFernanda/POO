package lista1;

import java.util.Scanner;

public class ProdutoMain {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		

		Produto produto1 = new Produto();
		System.out.println("nome do produto");
		produto1.setNome(tec.next());
		System.out.println("preco do produto");
		produto1.setPreco(tec.nextFloat());
		System.out.println("descricao do produto");
		produto1.setDescricao(tec.next());
		System.out.println("desconto do produto");
		produto1.setDesconto(tec.nextFloat());
		
		Produto produto2 = new Produto();
		System.out.println("nome do produto");
		produto2.setNome(tec.next());
		System.out.println("preco do produto");
		produto2.setPreco(tec.nextFloat());
		System.out.println("descricao do produto");
		produto2.setDescricao(tec.next());
		System.out.println("desconto do produto");
		produto2.setDesconto(tec.nextFloat());
		
		Produto produto3 = new Produto();
		System.out.println("nome do produto");
		produto3.setNome(tec.next());
		System.out.println("preco do produto");
		produto3.setPreco(tec.nextFloat());
		System.out.println("descricao do produto");
		produto3.setDescricao(tec.next());
		System.out.println("desconto do produto");
		produto3.setDesconto(tec.nextFloat());
		
		System.out.println(produto1);
		System.out.println(produto2);
		System.out.println(produto3);
		
		
		tec.close();
		
	}
}

package lista1;

import java.util.Scanner;

public class PessoaMain {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		Pessoa lorenzzo = new Pessoa("Lorenzzo", 'M', "01/10/2001");
		lorenzzo.imprimirPessoa();
		
		Pessoa andre = new Pessoa();
		System.out.println("seu nome");
		andre.setNome(tec.next());
		System.out.println("seu estado civil");
		andre.setEstadoCivil(tec.next());
		System.out.println("sua data de nascimento");
		andre.setDataNascimento(tec.next());
		System.out.println("seu sexo");
		andre.setSexo(tec.next().charAt(0));
		andre.imprimirPessoa();
		
		tec.close();
		
	}
}

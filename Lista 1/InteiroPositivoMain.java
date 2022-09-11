package lista1;

public class InteiroPositivoMain {
	public static void main(String[] args) {
		
		InteiroPositivo quatro = new InteiroPositivo(4);
		System.out.println(quatro.getValor() + " multiplicado por 90 = " + quatro.retorna(new InteiroPositivo(90)));
		System.out.println("fatorial de " + quatro.getValor() + " = " + quatro.fatorial(quatro.getValor()));
		System.out.println("numero = "+ quatro.getValor());
		System.out.println(quatro.divisores());
		System.out.println("sequencia de fibonacci ate o 21 : ");
		quatro.fibonacci();
		System.out.println("\nformula H = " + quatro.valorH());
		System.out.println("formula I = " + quatro.valorI());
		System.out.println("formula S = " + quatro.valorS());
		System.out.println("formula P = " + quatro.valorP());
		
	}
}

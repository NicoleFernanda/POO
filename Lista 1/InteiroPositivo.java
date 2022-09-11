//Nicole Fernanda Rodrigues Alves
package lista1;

public class InteiroPositivo {
	private int valor;

	public InteiroPositivo(int valor) {
		this.valor = valor;
	}
	
	public InteiroPositivo() {
		
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		if (valor > 0) {
			this.valor = valor;
		}
	}
	
	public int retorna(InteiroPositivo obj) {
		return this.valor * obj.getValor();
	}

	public int fatorial(int valor) {
		
		int fat = 1;
		
		for (int valor02 = valor; valor02 > 0; valor02--) {
			fat = fat * valor02;
		}
		
		return fat;
		
	}
	
	public String divisores() {
		
		int numeroDivisores = 0;
		System.out.print("divisores = ");
		for (int i = 1; i <= valor ; i++) {
			
			if (valor % i == 0) {
//				System.out.print(i + " , ");
				System.out.print((i == valor) ? (i + ".") : (i + ", "));
				numeroDivisores++;
				continue;
			}
		}
			
			return "\nnumero de divisores = " + numeroDivisores;

	}
	
	public void fibonacci() {
		
		int num1 = 1, num2 = 0;
		
		for (; num1 < 21; ) {
		
			num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.print((num1 == 21) ? num1 + ".": num1 + ", ");
                       
		}
		
		
	}
	
	public double valorH() {
		
		double h = 0;
		
		for (float i = 1; i <= valor; i++) {
			
			h = h + 1/i;
		}
		
		return h;
	}
	
	public double valorI() {
		
		double i = valor * 2; //pq vai subtrair na primeira rodada do for
		float numerador = valor;
		
		for (float j = 1; j <= valor; j++) {
			
			i = i - (numerador/j);
			numerador--;	
		}
		
		return i;
	}
	
	public double valorS() {
		double s = 0;
		double numerador = 0;
		int expoente = 20;
		
		
		for (int i = 1; i <= 20; i++) {
			numerador = Math.pow(this.valor, expoente);
			expoente--;
			s = s + numerador / fatorial(i);
		}
		
		
		return s;
	}
	
	public double valorP() {
		double p = 0;
		int numerador = 2;
		int multiplicador = 1;
		
		for (int i = 1; i <= valor; i++) {
			
			if (i == 1 || i % 2 == 0) {
				multiplicador = 1;
			} else {
				multiplicador = -1;
			}
			
			p = p + (multiplicador * (fatorial(numerador)/i));
			//System.out.println(fatorial(numerador));
			numerador = numerador + 2;
			
		}
		
		return p;
	}
	
	
}

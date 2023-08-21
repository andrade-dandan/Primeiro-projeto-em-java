package Cofrinho;

public class Dolar extends Moeda {

	public Dolar(double valorDolar) {
		this.valor = valorDolar;
	}
	
	
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}
	
	// Convertendo dolar para real
	public double converter() {
		return this.valor * 5;
	}
	
	// Para que fosse possivel diferenciar dolar, real e euro e seus valores foi preciso alterar a funcionalidade Equals
	@Override
	public boolean equals(Object objeto) {

		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDolar = (Dolar) objeto;
		
		if(this.valor != objetoDolar.valor) {
			return false;
		}
		
		return true;
		
	}
	
}

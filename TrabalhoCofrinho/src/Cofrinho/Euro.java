package Cofrinho;

public class Euro extends Moeda {

	public Euro(double valorEuro) {
		this.valor = valorEuro;
	}
	
	
	public void info() {
		System.out.println("Euro - " + valor);
		
	}
	
	// Convertendo euro para real
	public double converter() {
		return this.valor * 5.35;
	}
	
	// Para que fosse possivel diferenciar dolar, real e euro e seus valores foi preciso alterar a funcionalidade Equals
	@Override
	public boolean equals(Object objeto) {

		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Euro objetoEuro = (Euro) objeto;
		
		if(this.valor != objetoEuro.valor) {
			return false;
		}
		
		return true;
		
	}
	

}

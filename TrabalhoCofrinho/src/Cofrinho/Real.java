package Cofrinho;

public class Real extends Moeda{

	public Real(double valorReal) {
		this.valor = valorReal;
	}
	
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	// O real acaba ficando ele mesmo ja que a conversão é 1:1
	public double converter() {
		return this.valor;
		
	}
	
	// Para que fosse possivel diferenciar dolar, real e euro e seus valores foi preciso alterar a funcionalidade Equals
	@Override
	public boolean equals(Object objeto) {

		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Real objetoReal = (Real) objeto;
		
		if(this.valor != objetoReal.valor) {
			return false;
		}
		
		return true;
		
	}
}

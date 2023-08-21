package Cofrinho;

import java.util.ArrayList;

public class Cofrinho {
	
	// Adicionando as moedas em uma lista
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho () {
		this.listaMoedas = new ArrayList<>();
	}
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	
	public void listagemMoedas() {
		// Aviso caso não tenha moedas
		if (this.listaMoedas.isEmpty()) {
			System.out.println("O cofrinho está vazio!");
			return;
		}
		
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}
	
	// Converter as moedas para real
	public double totalConvertido() {
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}

		double valorAcumulado = 0;
		
		for (Moeda moeda : this.listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
		
		return valorAcumulado;
		
	}
	
}

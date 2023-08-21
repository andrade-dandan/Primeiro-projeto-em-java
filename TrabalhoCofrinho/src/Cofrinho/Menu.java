package Cofrinho;
import java.util.Scanner;

public class Menu {
	
	private Scanner Scanner;
	private Cofrinho cofrinho;
	
	public Menu() {
		
		Scanner = new Scanner(System.in);
		cofrinho = new Cofrinho();
		
	}
	
	public void MenuExibir () {
		
		//Exibindo para o usuario as opções disponiveis
		System.out.println("----------- Cofrinho -----------");
		System.out.println("--------------------------------");
		System.out.println("1 - Adicionar Moedas -----------");
		System.out.println("2 - Retirar Moedas -------------");
		System.out.println("3 - Listar Moedas --------------");
		System.out.println("4 - Total de moedas em Reais ---");
		System.out.println("5 - Sair -----------------------");
		System.out.println("--------------------------------");
		
		String opcaoEscolhida = Scanner.next();
		
		
		switch (opcaoEscolhida) {
			
			//Adicionando uma moeda ao cofrinho
			case "1":
				System.out.println("Selecione o tipo de Moeda:");
				System.out.println("1 - Real -----------------");
				System.out.println("2 - Dolar ----------------");
				System.out.println("3 - Euro -----------------");
				
				int tipoMoeda = Scanner.nextInt();
				
				System.out.println("Digite o valor:");
				String valorDigitadoMoeda = Scanner.next();
				
				// Convertendo string para double
				valorDigitadoMoeda = valorDigitadoMoeda.replace(",",".");
				double valorMoeda = Double.parseDouble(valorDigitadoMoeda);
				
				Moeda moeda = null;
				
				if (tipoMoeda == 1) {
					moeda = new Real(valorMoeda);
					cofrinho.adicionar(moeda);
				} else if (tipoMoeda == 2) {
					moeda = new Dolar(valorMoeda);
				} else if (tipoMoeda == 3) {
					moeda = new Euro(valorMoeda);		
				} else {
					System.out.println("Moeda invalida, tente novamente!");
					MenuExibir();
					break;
				}	
				
				cofrinho.adicionar(moeda);
				System.out.println("Moeda adicionada ao cofrinho!");
			
				MenuExibir();
				break;
			
			// Remover
			case "2":
				removerMoedas();
				MenuExibir();
				
			// Listando as moedas	
			case "3":
				System.out.println("Atualmente o cofrinho possui:");
				cofrinho.listagemMoedas();
				MenuExibir();
				break;
			
			// Conventendo e exibindo o valor total
			case "4":
				double valorConvertido = cofrinho.totalConvertido();
				System.out.println("Valor total em Reais:" + valorConvertido);
				MenuExibir();
				break;
			
			// Sair
			case "5":
				System.out.println("Encerrando...");
				break;	
			
	
			default:
				System.out.println("Opção Inválida!");
				System.out.println("Tente Novamente");
				MenuExibir();
				break;
		
		}
		
		
		
	}
	
	// Removedor de moedas
	private void removerMoedas() {
		System.out.println("Selecione o tipo de Moeda:");
		System.out.println("1 - Real -----------------");
		System.out.println("2 - Dolar ----------------");
		System.out.println("3 - Euro -----------------");
		
		int tipoMoeda = Scanner.nextInt();
		
		System.out.println("Digite o valor:");
		String valorDigitadoMoeda = Scanner.next();
		
		// Convertendo o string para double
		valorDigitadoMoeda = valorDigitadoMoeda.replace(",",".");
		double valorMoeda = Double.parseDouble(valorDigitadoMoeda);
		
		Moeda moeda = null;
		
		if (tipoMoeda == 1) {
			moeda = new Real(valorMoeda);
			cofrinho.adicionar(moeda);
		} else if (tipoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (tipoMoeda == 3) {
			moeda = new Euro(valorMoeda);		
		} else {
			System.out.println("Moeda invalida, tente novamente!");
			MenuExibir();
		}	
		
		cofrinho.remover(moeda);

	}
	
}

package br.fai.collections02;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		
		
	}
	
	private Map<String, String> mapa = new HashMap <String, String>();

	private void start() {
		adicionarItensNoMapa();
		exibirValorNoMapaPelaChave("SRS");
		exibirValorNoMapaPelaChave("PA");
		
		
	}

	private void adicionarItensNoMapa() {
		mapa.put("SRS", "Santa Rita do Sapucaí");
		mapa.put("PA", "Pouso Alegre");	
		mapa.put("ITA", "Itajubá");
		mapa.put("ZORO", "Conceição dos Ouros");
		mapa.put("CAXU", "Cachoeira de Minas");
		
	}
	
	private void exibirValorNoMapaPelaChave(String chave) {
		
		String valorDoItemNoMapa = mapa.get(chave);
		if(valorDoItemNoMapa == null || valorDoItemNoMapa.isEmpty())
		{
			System.out.println("Esta chave não está presente no mapa: " + chave);
		}
		else {
		System.out.println("O valor dessa chave é: " 
	    + mapa.get(chave));
	}
  }
}

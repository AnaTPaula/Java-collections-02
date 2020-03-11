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
		mapa.put("SRS", "Santa Rita do Sapuca�");
		mapa.put("PA", "Pouso Alegre");	
		mapa.put("ITA", "Itajub�");
		mapa.put("ZORO", "Concei��o dos Ouros");
		mapa.put("CAXU", "Cachoeira de Minas");
		
	}
	
	private void exibirValorNoMapaPelaChave(String chave) {
		
		String valorDoItemNoMapa = mapa.get(chave);
		if(valorDoItemNoMapa == null || valorDoItemNoMapa.isEmpty())
		{
			System.out.println("Esta chave n�o est� presente no mapa: " + chave);
		}
		else {
		System.out.println("O valor dessa chave �: " 
	    + mapa.get(chave));
	}
  }
}

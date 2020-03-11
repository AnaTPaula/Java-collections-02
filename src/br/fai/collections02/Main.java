package br.fai.collections02;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		
		
	}
	
	private Map<String, String> mapa = new HashMap <String, String>();
	//private Map<String, String> mapa = null;

	private void start() {
		adicionarItensNoMapa();
		exibirValorNoMapaPelaChave("SRS");
		exibirValorNoMapaPelaChave("VALOR QUE N�O EXISTE");
		iterarMapa();
		
		
	}

	private void adicionarItensNoMapa() {
		
		try {
			mapa.put("SRS", "Santa Rita do Sapuca�");
			mapa.put("PA", "Pouso Alegre");	
			mapa.put("ITA", "Itajub�");
			mapa.put("ZORO", "Concei��o dos Ouros");
			mapa.put("CAXU", "Cachoeira de Minas");
			
			System.out.println("Cheguei no fim do try");
		} catch (Exception e)
		{
			System.out.println("Ocorreu uma exce��o");
		}finally {
			System.out.println("Cheguei no finally");
		}
		
		
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
	
	private void iterarMapa() {
		
		System.out.println("-----------------");
		
		for(String chave: mapa.keySet())
		{
			System.out.println("Chave: " + chave + " | Valor: " + mapa.get(chave));
		}
			
	}
	
	
	
	
	
	
}

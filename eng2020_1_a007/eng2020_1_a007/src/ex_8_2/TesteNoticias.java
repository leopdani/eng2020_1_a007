package ex_8_2;


import ex_8_2.Agregadores.AgregadorMes;
import ex_8_2.Agregadores.AgregadorTopico;
import ex_8_2.Agregadores.Agregadores;
import ex_8_2.Agregadores.NoticiarioAssina;
import ex_8_2.Agregadores.Publicador;
import ex_8_2.Noticias.FonteNoticias;
import ex_8_2.Noticias.Noticia;

public class TesteNoticias {

	public static void main(String[] args) {
		
		FonteNoticias fonte = new FonteNoticias();
		
		Publicador publicador = new Publicador(fonte);
		publicador.assina();	
		
		NoticiarioAssina observador1 = new NoticiarioAssina(fonte, "Estadao");	
		observador1.setTopicos("Fake News");
		observador1.assina();
		
		NoticiarioAssina observador2 = new NoticiarioAssina(fonte, "Folha");	
		observador2.setTopicos("Futebol");
		observador2.assina();
		
		Agregadores agregadorTopico = new AgregadorTopico(fonte, "Fake News");
		agregadorTopico.assina();
		Agregadores agregadorMes = new AgregadorMes(fonte, 4);
		agregadorMes.assina();	
		
		System.out.println();
		Noticia noticia = new Noticia();

		
		for(int i = 1; i < 12; i++) {
			noticia.setTexto("Testando Noticia " + i + "\n");
			noticia.setDia(i);
			noticia.setMes(4);
			noticia.setTopico("Fake News");
			if(i == 4) {
				System.out.println();
				observador1.cancela();
				System.out.println();
			}
			fonte.setNoticia(noticia);
			System.out.println("Fim  scan\n");
		}
		
		noticia.setTexto("Jogo do palmeiras vs corintias termina em 6 a 0 para o verdão!");
		noticia.setDia(1);
		noticia.setMes(6);
		noticia.setTopico("Futebol");
		fonte.setNoticia(noticia);
		
		

	}

}
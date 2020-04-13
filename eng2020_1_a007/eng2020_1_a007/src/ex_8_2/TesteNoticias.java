package ex_8_2;


import ex_8_2.observer.AgregadorMes;
import ex_8_2.observer.AgregadorTopico;
import ex_8_2.observer.Agregadores;
import ex_8_2.observer.NoticiarioAssina;
import ex_8_2.observer.Publicador;
import ex_8_2.subject.FonteNoticias;
import ex_8_2.subject.Noticia;

public class TesteNoticias {

	public static void main(String[] args) {
		
		FonteNoticias fonte = new FonteNoticias();
		
		Publicador publicador = new Publicador(fonte);
		publicador.assina();	
		
		NoticiarioAssina observador1 = new NoticiarioAssina(fonte, "Folha");	
		observador1.setTopicos("Fake News");
		observador1.assina();
		
		NoticiarioAssina observador2 = new NoticiarioAssina(fonte, "Estadao");	
		observador2.setTopicos("Futebol");
		observador2.assina();
		
		Agregadores agregadorTopico = new AgregadorTopico(fonte, "Fake News");
		agregadorTopico.assina();
		Agregadores agregadorMes = new AgregadorMes(fonte, 4);
		agregadorMes.assina();	
		
		System.out.println();
		Noticia noticia = new Noticia();

		
		for(int i = 1; i < 12; i++) {
			noticia.setTexto("Notícia de teste " + i + "\n");
			noticia.setDia(i);
			noticia.setMes(4);
			noticia.setTopico("Fake News");
			if(i == 4) {
				System.out.println();
				observador1.cancela();
				System.out.println();
			}
			fonte.setNoticia(noticia);
			System.out.println("Fim do ciclo\n");
		}
		
		noticia.setTexto("Jogo do palmeiras vs corintias termina em 6 a 0 para o verdão!");
		noticia.setDia(1);
		noticia.setMes(5);
		noticia.setTopico("Futebol");
		fonte.setNoticia(noticia);
		
		//observador2.cancela();

	}

}
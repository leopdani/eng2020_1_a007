package ex_8_2;

import ex_8_1.observer.NoticiarioAssina;
import ex_8_1.subject.FonteNoticias;
import ex_8_1.subject.Noticia;

public class Teste_8_2 {
	public static void main(String[] args) {
		
		FonteNoticias fonte = new FonteNoticias();
		
		Publicar publicador = new Publicar();	
		
		Noticia noticia = new Noticia();
		noticia.setTexto("Ontem choveu");
		noticia.setDia(2);
		noticia.setMes(4);
		noticia.setTopico("Previsão do Tempo");
		
		Noticia noticia2 = new Noticia();
		noticia.setTexto("Queima de estoque");
		noticia.setDia(5);
		noticia.setMes(4);
		noticia.setTopico("Anuncios");
		
		publicador.lista();
		publicador.add(noticia2);
		publicador.add(noticia);
		publicador.publica();
		
	}
}
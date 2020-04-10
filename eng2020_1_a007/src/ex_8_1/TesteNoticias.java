package ex_8_1;

import ex_8_1.observer.NoticiarioAssina;
import ex_8_1.subject.FonteNoticias;
import ex_8_1.subject.Noticia;

public class TesteNoticias {
	public static void main(String[] args) {
		FonteNoticias fonte = new FonteNoticias();
		
		NoticiarioAssina observador1 = new NoticiarioAssina(fonte, "Folha");	
		observador1.assina();
		
		NoticiarioAssina observador2 = new NoticiarioAssina(fonte, "Estadao");	
		observador2.assina();
		
		Noticia noticia = new Noticia();
		noticia.setTexto("Ontem choveu");
		noticia.setDia(2);
		noticia.setMes(4);
		noticia.setTopico("Previsão do Tempo");
		
		fonte.setNoticia(noticia);
		
		noticia.setTexto("Acabou a quarentena.");
		noticia.setDia(1);
		noticia.setTopico("Fake News");
		
		observador2.cancela();
		fonte.setNoticia(noticia);
		
		
		noticia.setTexto("Amanha ira choveu");
		noticia.setDia(3);
		noticia.setMes(5);
		noticia.setTopico("Previsão do Tempo");
		
		fonte.setNoticia(noticia);
		
		
	}
}
package ex_8_2.observer;

import java.util.ArrayList;

import ex_8_2.subject.FonteNoticias;
import ex_8_2.subject.Noticia;

public class AgregadorTopico extends Agregadores{
	
	private ArrayList<Noticia> noticias = new ArrayList<Noticia>();
	private String topico;
	
	public AgregadorTopico(FonteNoticias fonte, String topico) {
		this.topico = topico;
		this.fonte = fonte;
		this.nome = "Agregador de topicos";
	}
	
	@Override
	public void concatena(Noticia noticia) {
		if(topico.equals(noticia.getTopico())){
			noticias.add(noticia);			
		}
		if(noticias.size() == 10) {
			System.out.println("**********************");
			System.out.println("Agregador de topicos enviando notícias.\n");
			System.out.printf("Data da última notícia: %d/%d \n", noticias.get(noticias.size()-1).getDia(), noticias.get(noticias.size()-1).getMes());
			System.out.println("**********************");
			for(Noticia cnoticia: noticias) {
				System.out.printf("Noticia: %s\n", cnoticia.getTexto());
			}
			System.out.println("**********************");
			removeNoticias();
		}
	}
	
	private void removeNoticias() {
		noticias.clear();
	}

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		Noticia noticia = new Noticia(textoNoticia, dia, mes, topico);
		concatena(noticia);
	}


}
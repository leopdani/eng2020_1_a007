package ex_8_2.observer;

import java.util.ArrayList;

import ex_8_2.subject.FonteNoticias;
import ex_8_2.subject.Noticia;

public class AgregadorMes extends Agregadores {
	
	private ArrayList<Noticia> noticias = new ArrayList<Noticia>();
	private int mes;	
	
	public AgregadorMes(FonteNoticias fonte, int mes) {
		this.mes = mes;
		this.fonte = fonte;
		this.nome = "Agregador de meses";
	}

	@Override
	public void concatena(Noticia noticia) {
		if(mes == noticia.getMes()){
			noticias.add(noticia);			
		} else {
			System.out.println("--------------------------");
			System.out.println("Agregador de meses enviando notícias.\n");
			System.out.printf("Dia da primeira notícia: %d \nTopico: Mensal\n", noticias.get(3).getDia());
			System.out.println("---------------------------");
			for(Noticia cnoticia: noticias) {
				System.out.printf("Noticia: %s\n", cnoticia.getTexto());
			}
			System.out.println("--------------------------");
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
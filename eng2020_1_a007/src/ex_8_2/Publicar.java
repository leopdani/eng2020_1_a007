package ex_8_2;

import java.util.ArrayList;

import ex_8_1.subject.FonteNoticias;
import ex_8_1.subject.Noticia;

public class Publicar extends Publicadores {

	public Publicar(FonteNoticias fonte, ArrayList<Noticia> noticias) {
		super(fonte, noticias);
	}
	
	public Publicar() {
		
	}

	public void Publicadores(){
	}

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
	}
	
	public void lista() {
		noticias = new ArrayList<Noticia>();
	}

	public void publica() {
		System.out.println(noticias);
	}

}
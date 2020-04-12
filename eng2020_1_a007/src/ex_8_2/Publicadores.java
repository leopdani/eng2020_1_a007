package ex_8_2;

import java.util.ArrayList;

import ex_8_1.observer.ConsomeNoticia;
import ex_8_1.subject.FonteNoticias;
import ex_8_1.subject.Noticia;

public abstract class Publicadores implements ConsomeNoticia {
	protected FonteNoticias fonte;
	public ArrayList<Noticia> noticias;
	
	public Publicadores(){
	}
	
	public Publicadores(FonteNoticias fonte, ArrayList<Noticia> noticias){
		this.fonte = fonte;
		this.noticias = new ArrayList<>();
	}
	
	public void add(Noticia noticia) {
		noticias.add(noticia);
	}

	public FonteNoticias getFonte() {
		return fonte;
	}

	public void setFonte(FonteNoticias fonte) {
		this.fonte = fonte;
	}

	public ArrayList<Noticia> getNotcias() {
		return noticias;
	}

	public void setNoticias(ArrayList<Noticia> noticias) {
		this.noticias = noticias;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Publicadores other = (Publicadores) obj;
		if(noticias == null){
			if(other.noticias != null)
				return false;
		}else if(!noticias.equals(other.noticias))
			return false;
		return true;
	}
}
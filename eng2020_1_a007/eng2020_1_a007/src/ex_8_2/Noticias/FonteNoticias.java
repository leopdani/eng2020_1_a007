package ex_8_2.Noticias;

import java.util.ArrayList;

import ex_8_2.Agregadores.ConsomeNoticia;

public class FonteNoticias implements Assunto {
	private ArrayList<ConsomeNoticia> observadores;
	private Noticia noticia;
	
	public FonteNoticias(){
		this.observadores = new ArrayList<>();
	}
	
	@Override
	public void registraObservador(ConsomeNoticia observer){
		observadores.add(observer);
	}
	
	@Override
	public void removeObservador(ConsomeNoticia observer){
		observadores.remove(observer);
	}
	
	@Override
	public void notificaTodos() {
		for(ConsomeNoticia observer:observadores){
			observer.consomeNoticia(noticia.getTexto(), noticia.getDia(),
					noticia.getMes(), noticia.getTopico());
		}
	}

	public ArrayList<ConsomeNoticia> getObservadores() {
		return observadores;
	}

	public void setObservadores(ArrayList<ConsomeNoticia> observadores) {
		this.observadores = observadores;
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
		this.notificaTodos();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FonteNoticias other = (FonteNoticias) obj;
		if (noticia == null) {
			if (other.noticia != null)
				return false;
		} else if (!noticia.equals(other.noticia))
			return false;
		if (observadores == null) {
			if (other.observadores != null)
				return false;
		} else if (!observadores.equals(other.observadores))
			return false;
		return true;
	}
	
	
}
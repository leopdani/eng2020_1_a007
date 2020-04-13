package ex_8_2.Agregadores;

import ex_8_2.Noticias.FonteNoticias;
import ex_8_2.Noticias.Noticia;

public abstract class Agregadores implements ConsomeNoticia{
	
	protected FonteNoticias fonte;
	protected String nome;
	
	public abstract void concatena(Noticia noticia);
	
	public void assina() {
		fonte.registraObservador(this);
		System.out.println(nome + " assinante");
	}
	
	public void cancela() {
		fonte.removeObservador(this);
		System.out.println(nome + " cancelamento");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agregadores other = (Agregadores) obj;
		if (fonte == null) {
			if (other.fonte != null)
				return false;
		} else if (!fonte.equals(other.fonte))
			return false;
		return true;
	}	
	
	
}
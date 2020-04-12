package ex_8_2;

import ex_8_1.observer.ConsomeNoticia;
import ex_8_1.subject.FonteNoticias;


public abstract class Agregadores implements ConsomeNoticia {
	private FonteNoticias fonte;
	private String nome;
	
	public Agregadores(FonteNoticias fonte, String nome){
		this.fonte = fonte;
		this.nome = nome;
	}
	
	public abstract void notificaNoticia(String textoNoticia, int dia, int mes, 
			String topico);
	
	public void assina(){
		fonte.registraObservador(this);
		System.out.println(nome+ " assinou.");
	}
	public void cancela(){
		fonte.removeObservador(this);
		System.out.println(nome+ " cancelou.");
	}

	public FonteNoticias getFonte() {
		return fonte;
	}

	public void setFonte(FonteNoticias fonte) {
		this.fonte = fonte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Agregadores other = (Agregadores) obj;
		if(nome == null){
			if(other.nome != null)
				return false;
		}else if(!nome.equals(other.nome))
			return false;
		return true;
	}
}
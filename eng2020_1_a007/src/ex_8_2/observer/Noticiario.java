package ex_8_2.observer;

import java.util.ArrayList;

import ex_8_2.subject.FonteNoticias;

public abstract class Noticiario implements ConsomeNoticia {
	private FonteNoticias fonte;
	private String nome;
	private ArrayList<String> topicos;
	
	public Noticiario(FonteNoticias fonte, String nome){
		this.fonte = fonte;
		this.nome = nome;
		this.topicos = new ArrayList<String>();
	}
	
	public abstract void notificaNoticia(String textoNoticia, int dia, int mes, 
			String topico);
	
	public void assina(){
		fonte.registraObservador(this);
		System.out.println(nome+ " assinou " + topicos.toString());
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
	
	
	
	public ArrayList<String> getTopicos() {
		return topicos;
	}

	public void setTopicos(String topico) {
		topicos.add(topico);
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Noticiario other = (Noticiario) obj;
		if(nome == null){
			if(other.nome != null)
				return false;
		}else if(!nome.equals(other.nome))
			return false;
		return true;
	}
}
package ex_8_2.observer;

import ex_8_2.subject.FonteNoticias;

public class Publicador implements ConsomeNoticia {
	
	private String nome;
	private FonteNoticias fonte;
	
	public Publicador(FonteNoticias fonte) {
		this.fonte = fonte;
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void assina(){
		fonte.registraObservador(this);
	}
	public void cancela(){
		fonte.removeObservador(this);
	}

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Veiculo: Publicador");
		System.out.printf("Tópico: %s\nData: %d/%d\n%s\n", topico, dia, mes, textoNoticia);
		System.out.println("-----------------------------------------");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicador other = (Publicador) obj;
		if (fonte == null) {
			if (other.fonte != null)
				return false;
		} else if (!fonte.equals(other.fonte))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
package ex_8_1.observer;

import ex_8_1.subject.FonteNoticias;

public class NoticiarioAssina extends Noticiario {

	public NoticiarioAssina(FonteNoticias fonte, String nome) {
		super(fonte, nome);
	}

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Ve�culo: "+this.getNome());
		System.out.printf("T�pico: %s\nData: %d/%d\n%s\n", topico, dia, mes, textoNoticia);
		System.out.println("-----------------------------------------");
	}

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		this.notificaNoticia(textoNoticia, dia, mes, topico);
	}
	
}
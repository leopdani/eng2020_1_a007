package ex_8_2.observer;

import ex_8_2.subject.*;

public class NoticiarioAssina extends Noticiario {
	
	public NoticiarioAssina(FonteNoticias fonte, String nome){
		super(fonte,nome);
	}
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico){
		System.out.println("Veiculo: "+this.getNome());
		System.out.printf("Tópico: %s\nData: %d/%d\n%s\n", topico, dia, mes, textoNoticia);
		System.out.println("-----------------------------------------");
	}

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico){
		if(this.getTopicos().contains(topico))
			this.notificaNoticia(textoNoticia, dia, mes, topico);
	}
}
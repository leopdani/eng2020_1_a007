package ex_8_2.observer;

/*esta interface é a interface observer */

public interface ConsomeNoticia {
	public void consomeNoticia(String textoNoticia, int dia, int mes, 
			String topico);
}
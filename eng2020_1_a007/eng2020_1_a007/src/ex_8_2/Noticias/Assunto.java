package ex_8_2.Noticias;

import ex_8_2.Agregadores.ConsomeNoticia;

public interface Assunto {
	void registraObservador(ConsomeNoticia observer);
	void removeObservador(ConsomeNoticia observer);
	void notificaTodos();
}
package ex_8_2.subject;

import ex_8_2.observer.ConsomeNoticia;

public interface Assunto {
	void registraObservador(ConsomeNoticia observer);
	void removeObservador(ConsomeNoticia observer);
	void notificaTodos();
}
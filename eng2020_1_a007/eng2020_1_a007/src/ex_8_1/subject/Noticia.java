package ex_8_1.subject;

public class Noticia {
	private String texto;
	private int dia;
	private int mes;
	private String topico;
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getTopico() {
		return topico;
	}
	public void setTopico(String topico) {
		this.topico = topico;
	}
	@Override
	public String toString() {
		return "Noticia [texto=" + texto + ", dia=" + dia + ", mes=" + mes + ", topico=" + topico + "]";
	}
	}